package generic;

public class TreeDPrinterTest {

	public static void main(String[] args) {
		TreeDPrinter<Powder> printer = new TreeDPrinter<Powder>();
		printer.setMaterial(new Powder());
		Powder powder = printer.getMaterial();
		System.out.println(printer);
		
		
		TreeDPrinter<Plastic> printerPlastic = new TreeDPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic());
		Plastic plastic = printerPlastic.getMaterial();
		System.out.println(plastic);
	
		
//		TreeDPrinter<Water> printerWater = new TreeDPrinter<Water>();
//		printerWater.setMaterial(new Water());
//		System.out.println(printerWater.getMaterial());
//	}
		
		printerPlastic.printing();
	}

}
