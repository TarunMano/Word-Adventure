package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.gamePanel;

public class OBJ_areaChecker31 extends SuperObject {
	gamePanel gp;
public OBJ_areaChecker31(gamePanel gp) {
	this.gp = gp;
		name = "areaChecker31";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/tiles/sand.png"));
			uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		}catch(IOException e) {
			e.printStackTrace();
		}
		collision = false;
	}
	

}