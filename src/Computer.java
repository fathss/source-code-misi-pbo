import java.util.ArrayList;

public class Computer {
	public int totalHarga = 0;
	ArrayList<MainComponent> mainComponents = new ArrayList<>();
	ArrayList<StorageComponent> storageComponents = new ArrayList<>();
	ArrayList<Periferal> periferalComponents = new ArrayList<>();

	public Computer(Motherboard m, CPU c, RAM r) {
		this.mainComponents.add(m);
		this.mainComponents.add(c);
		this.mainComponents.add(r);
	}

	public void addStorageComponent(StorageComponent s) {
		this.storageComponents.add(s);
	}

	public void addPeriferalComponent(Periferal p) {
		this.periferalComponents.add(p);
	}

	public void calculateTotalPrice() {
		for (MainComponent component : mainComponents) {
			totalHarga += component.getHarga();
		}

		for (StorageComponent component : storageComponents) {
			totalHarga += component.getHarga();
		}

		for (Periferal component : periferalComponents) {
			totalHarga += component.getHarga();
		}
	}

	public void getInfoProduk() {
		System.out.println("--------------------------------------------");
    		System.out.println("\t--- PC Build Report ---");
	    	System.out.println("--------------------------------------------");
	    	System.out.println("Jenis\t\t Merk\t\t Harga");

	    	for (MainComponent component : mainComponents) {
	        	if (component instanceof Motherboard) {
	            		System.out.println("Motherboard\t " + component.getMerk() + "\t\t " + component.getHarga());
	        	} 
			else if (component instanceof CPU) {
	            		System.out.println("CPU\t\t " + component.getMerk() + "\t\t " + component.getHarga());
	        	} 
			else if (component instanceof RAM) {
		            	System.out.println("RAM\t\t " + component.getMerk() + "\t " + component.getHarga());
	        	}
	    	}

    		for (StorageComponent component : storageComponents) {
        		if (component instanceof SSD) {
            			System.out.println("SSD\t\t " + component.getMerk() + "\t " + component.getHarga());
        		} 
			else if (component instanceof HDD) {
            			System.out.println("HDD\t\t " + component.getMerk() + "\t " + component.getHarga());
        		} 
			else if (component instanceof FlashDisk) {
            			System.out.println("Flashdisk\t " + component.getMerk() + "\t " + component.getHarga());
        		}
    		}

    		for (Periferal component : periferalComponents) {
        		if (component instanceof Mouse) {
            			System.out.println("Mouse\t\t " + component.getMerk() + "\t " + component.getHarga());
        		} 
			else if (component instanceof Keyboard) {
            			System.out.println("Keyboard\t " + component.getMerk() + "\t " + component.getHarga());
        		} 
			else if (component instanceof Monitor) {
            			System.out.println("Monitor\t\t " + component.getMerk() + "\t\t " + component.getHarga());
        		}
    		}

    		System.out.println("--------------------------------------------");
    		System.out.println("Total Harga:\t\t\t " + totalHarga);
    		System.out.println("--------------------------------------------");
	}
}