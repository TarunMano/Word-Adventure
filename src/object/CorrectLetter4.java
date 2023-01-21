package object;

import java.io.IOException;

import javax.imageio.ImageIO;

import main.gamePanel;

public class CorrectLetter4 extends SuperObject {
	
	gamePanel gp;
 
  public CorrectLetter4(gamePanel gp) {
	  
	this.gp = gp;
	
	name = "cL4";
	
	try {
		image = ImageIO.read(getClass().getResourceAsStream("/objects/ALPHABET png/" + gp.cL4 +".png"));
		uTool.scaleImage(image, gp.tileSize, gp.tileSize);
		
	}catch(IOException e) {
		e.printStackTrace();
		}
		collision = true;
	
  }
}