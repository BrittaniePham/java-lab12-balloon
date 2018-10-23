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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isHelium ? 1231 : 1237);
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Balloon other = (Balloon) obj;
		if (isHelium != other.isHelium)
			return false;
		if (size != other.size)
			return false;
		return true;
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
