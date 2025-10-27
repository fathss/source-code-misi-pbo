public class Main {
	public static void generateReport(Computer computer) {
        	computer.getInfoProduk();
    	}

    	public static void main(String args[]) {
       	        Computer pc1 = new Computer(
                		new Motherboard("ASUS", 2700000),
	                	new CPU("AMD", 2700000),
	                	new RAM("Corsair", 850000)
        	);

        	SSD ssd1 = new SSD("Samsung 512GB", 1400000);
		SSD ssd2 = new SSD("Samsung 512GB", 1400000);
        	HDD hdd1 = new HDD("Seagate", 850000);
        	FlashDisk flashDisk1 = new FlashDisk("SanDisk", 60000);

        	pc1.addStorageComponent(ssd1);
		pc1.addStorageComponent(ssd2);
        	pc1.addStorageComponent(hdd1);
        	pc1.addStorageComponent(flashDisk1);
        
		Mouse mouse1 = new Mouse("Logitech", 250000);
        	Keyboard keyboard1 = new Keyboard("Keychron", 1200000);
        	Monitor monitor1 = new Monitor("Acer", 2200000);

        	pc1.addPeriferalComponent(mouse1);
        	pc1.addPeriferalComponent(keyboard1);
        	pc1.addPeriferalComponent(monitor1);

        	pc1.calculateTotalPrice();
        	generateReport(pc1);
    	}
}
