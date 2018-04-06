package dkeep.logic;

import java.util.concurrent.ThreadLocalRandom;

/**
 * The Class Club.
 */
public class Club extends Entity{

	/** The ogre that owns this club. */
	protected Ogre ogre;
	
	/**
	 * Instantiates a new club.
	 *
	 * @param xpos the xpos
	 * @param ypos the ypos
	 * @param ogre the ogre
	 * @param map the map
	 */
	public Club(int xpos, int ypos, Ogre ogre, Map map) {
		super(xpos, ypos, map);
		symbol = '*';
		this.ogre = ogre;
	}

	/* (non-Javadoc)
	 * @see dkeep.logic.Entity#updateEntity()
	 */
	@Override
	public void updateEntity() {
		if(this.ogre != null)
		{
			// random number that defines club's swing direction
			int club_mov = ThreadLocalRandom.current().nextInt(0, 3 + 1);
			switch (club_mov) {
			case 0:
				if (this.map.basemap[ogre.x][ogre.y - 1] != 'X') {
					if (this.map.map[ogre.x][ogre.y - 1] == 'k') {
						this.symbol = '$';
						this.x = ogre.x;
						this.y = ogre.y - 1;
					} else {
						this.symbol = '*';
						this.x = ogre.x;
						this.y = ogre.y - 1;
					}
				}
				else {
					this.x = ogre.x;
					this.y = ogre.y;
				}
				break;
			case 1:
				if (this.map.basemap[ogre.x][ogre.y + 1] != 'X') {
					if (this.map.map[ogre.x][ogre.y + 1] == 'k') {
						this.symbol = '$';
						this.x = ogre.x;
						this.y = ogre.y + 1;
					} else {
						this.symbol = '*';
						this.x = ogre.x;
						this.y = ogre.y + 1;
					}
				}
				else {
					this.x = ogre.x;
					this.y = ogre.y;
				}
				break;
			case 2:
				if (this.map.basemap[ogre.x - 1][ogre.y] != 'X') {
					if (this.map.map[ogre.x - 1][ogre.y] == 'k') {
						this.symbol = '$';
						this.x = ogre.x - 1;
						this.y = ogre.y;
					} else {
						this.symbol = '*';
						this.x = ogre.x - 1;
						this.y = ogre.y;
					}
				}
				else {
					this.x = ogre.x;
					this.y = ogre.y;
				}
				break;
			case 3:
				if (this.map.basemap[ogre.x + 1][ogre.y] != 'X') {
					if (this.map.map[ogre.x + 1][ogre.y] == 'k') {
						this.symbol = '$';
						this.x = ogre.x + 1;
						this.y = ogre.y;
					} else {
						this.symbol = '*';
						this.x = ogre.x + 1;
						this.y = ogre.y;
					}
				}
				else {
					this.x = ogre.x;
					this.y = ogre.y;
				}
				break;
			}
		}
	}

}
