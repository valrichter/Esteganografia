package _SteGraMageCore;

public class Main {

	public static void main(String[] args) {
		SteGraMage st = new SteGraMage();
		st.setInterpreter(new ASCIIMessageInterpreter());
		st.setConverter(new PNGConverter());
		
		String msg = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
		st.hide(msg, "image/gato.png");
		
		System.out.println(st.unhide("image/gato_out.png"));

	}

}
