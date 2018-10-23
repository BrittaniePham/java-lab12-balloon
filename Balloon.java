package lab12_balloon;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Balloon {
	private Size size;
	private boolean isHelium;
	private Icon icon;
	
	@Override
	public String toString() {
		return (isHelium() ? "Helium" : "Air" ) + " " + getSize();
	}
	
	public Balloon(boolean h, Size s) {
		String img = "";
		size = s;
		isHelium = h;
		switch(s) {
		case XL:
			img = "balloon100.jpg";
			break;
		case L:
			img = "balloon80.jpg";
			break;
		case M:
			img = "balloon60.jpg";
			break;
		case SM:
			img = "balloon40.jpg";
			break;
		case XS:
			img = "balloon20.jpg";
			break;
		}
		icon = (new ImageIcon(BalloonApp.class.getResource("/lab12_balloon/images/balloon/" + img)));

	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	public boolean isHelium() {
		return isHelium;
	}

	public void setHelium(boolean isHelium) {
		this.isHelium = isHelium;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}
}
