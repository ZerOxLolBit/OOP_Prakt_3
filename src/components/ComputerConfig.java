//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package components;

import components.builders.CoolingSystemBuilder;
import components.builders.GraphicsCardBuilder;
import components.builders.HardDriveBuilder;
import components.builders.MotherboardBuilder;
import components.builders.PowerSupplyBuilder;
import components.builders.ProcessorBuilder;
import components.builders.RAMBuilder;
import java.io.PrintStream;
import java.util.Scanner;

public class ComputerConfig {
  public ComputerConfig() {
  }

  public static void main(String[] args) {
    String inteltype = "Intel";
    String amdtype = "AMD";
    Processor processor1 = (new ProcessorBuilder("Intel Core i7")).typeClass(inteltype).clockSpeed(3.4).cores(8).price(300.0).build();
    Processor processor2 = (new ProcessorBuilder("AMD Ryzen 5")).typeClass(amdtype).clockSpeed(3.2).cores(6).price(250.0).build();
    Processor processor3 = (new ProcessorBuilder("Intel Core i5")).typeClass(inteltype).clockSpeed(3.0).cores(4).price(200.0).build();
    Processor processor4 = (new ProcessorBuilder("AMD Ryzen 7")).typeClass(amdtype).clockSpeed(3.6).cores(8).price(350.0).build();
    Processor processor5 = (new ProcessorBuilder("Intel Core i9")).typeClass(inteltype).clockSpeed(3.8).cores(10).price(500.0).build();
    String LGAsocketType = "LGA1200";
    String AM4socketType = "AM4";
    Motherboard motherboard1 = (new MotherboardBuilder("ASUS ROG Strix")).socketType(LGAsocketType).ramCountSlot(4).price(200.0).build();
    Motherboard motherboard2 = (new MotherboardBuilder("MSI B450 TOMAHAWK")).socketType(AM4socketType).ramCountSlot(2).price(150.0).build();
    Motherboard motherboard3 = (new MotherboardBuilder("GIGABYTE B550 AORUS PRO")).socketType(AM4socketType).ramCountSlot(4).price(180.0).build();
    Motherboard motherboard4 = (new MotherboardBuilder("ASRock Z590 Extreme")).socketType(LGAsocketType).ramCountSlot(4).price(220.0).build();
    Motherboard motherboard5 = (new MotherboardBuilder("MSI MPG X570 GAMING EDGE WIFI")).socketType(AM4socketType).ramCountSlot(4).price(200.0).build();
    RAM ram1 = (new RAMBuilder("Corsair Vengeance")).capacityGB(16).speedMHz(3200).price(120.0).build();
    RAM ram2 = (new RAMBuilder("G.SKILL Ripjaws V")).capacityGB(32).speedMHz(3600).price(200.0).build();
    RAM ram3 = (new RAMBuilder("Crucial Ballistix")).capacityGB(8).speedMHz(2666).price(80.0).build();
    RAM ram4 = (new RAMBuilder("Kingston HyperX Fury")).capacityGB(64).speedMHz(3200).price(300.0).build();
    RAM ram5 = (new RAMBuilder("ADATA XPG Z1")).capacityGB(16).speedMHz(3000).price(100.0).build();
    HardDrive hardDrive1 = (new HardDriveBuilder("Samsung SSD")).capacityGB(512).price(150.0).build();
    HardDrive hardDrive2 = (new HardDriveBuilder("Western Digital Blue")).capacityGB(1000).price(80.0).build();
    HardDrive hardDrive3 = (new HardDriveBuilder("Seagate Barracuda")).capacityGB(2000).price(100.0).build();
    HardDrive hardDrive4 = (new HardDriveBuilder("Crucial MX500")).capacityGB(256).price(70.0).build();
    HardDrive hardDrive5 = (new HardDriveBuilder("SanDisk SSD PLUS")).capacityGB(480).price(120.0).build();
    GraphicsCard graphicsCard1 = (new GraphicsCardBuilder("NVIDIA GeForce RTX 3080")).memoryGB(10).price(800.0).build();
    GraphicsCard graphicsCard2 = (new GraphicsCardBuilder("AMD Radeon RX 6800 XT")).memoryGB(16).price(750.0).build();
    GraphicsCard graphicsCard3 = (new GraphicsCardBuilder("NVIDIA GeForce GTX 1660 Super")).memoryGB(6).price(250.0).build();
    GraphicsCard graphicsCard4 = (new GraphicsCardBuilder("AMD Radeon RX 5700 XT")).memoryGB(8).price(400.0).build();
    GraphicsCard graphicsCard5 = (new GraphicsCardBuilder("NVIDIA GeForce RTX 3060")).memoryGB(12).price(350.0).build();
    PowerSupply powerSupply1 = (new PowerSupplyBuilder("Corsair CX550M")).wattage(550).price(70.0).build();
    PowerSupply powerSupply2 = (new PowerSupplyBuilder("EVGA SuperNOVA 750 G5")).wattage(750).price(100.0).build();
    PowerSupply powerSupply3 = (new PowerSupplyBuilder("Seasonic FOCUS GX-850")).wattage(850).price(130.0).build();
    PowerSupply powerSupply4 = (new PowerSupplyBuilder("Thermaltake Toughpower GF1 650W")).wattage(650).price(90.0).build();
    PowerSupply powerSupply5 = (new PowerSupplyBuilder("Cooler Master MWE Gold 750")).wattage(750).price(85.0).build();
    CoolingSystem coolingSystem1 = (new CoolingSystemBuilder("CoolerMaster123")).type("Air Cooling").fanSpeed(1200).price(50).build();
    CoolingSystem coolingSystem2 = (new CoolingSystemBuilder("NZXTLiquidCooler")).type("Liquid Cooling").fanSpeed(2000).price(120).build();
    CoolingSystem coolingSystem3 = (new CoolingSystemBuilder("ArcticFreezer")).type("Air Cooling").fanSpeed(1500).price(40).build();
    CoolingSystem coolingSystem4 = (new CoolingSystemBuilder("CorsairHydro")).type("Liquid Cooling").fanSpeed(1800).price(130).build();
    CoolingSystem coolingSystem5 = (new CoolingSystemBuilder("DeepCoolGamerStorm")).type("Air Cooling").fanSpeed(1400).price(55).build();
    PrintStream var10000 = System.out;
    String var10001 = ram1.getModel();
    var10000.println("RAM 1: " + var10001 + ", Capacity: " + ram1.getCapacityGB() + "GB, Price: " + ram1.getPrice() + "$");
    var10000 = System.out;
    var10001 = ram2.getModel();
    var10000.println("RAM 2: " + var10001 + ", Capacity: " + ram2.getCapacityGB() + "GB, Price: " + ram2.getPrice() + "$");
    var10000 = System.out;
    var10001 = ram3.getModel();
    var10000.println("RAM 3: " + var10001 + ", Capacity: " + ram3.getCapacityGB() + "GB, Price: " + ram3.getPrice() + "$");
    var10000 = System.out;
    var10001 = ram4.getModel();
    var10000.println("RAM 4: " + var10001 + ", Capacity: " + ram4.getCapacityGB() + "GB, Price: " + ram4.getPrice() + "$");
    var10000 = System.out;
    var10001 = ram5.getModel();
    var10000.println("RAM 5: " + var10001 + ", Capacity: " + ram5.getCapacityGB() + "GB, Price: " + ram5.getPrice() + "$");
    var10000 = System.out;
    var10001 = hardDrive1.getModel();
    var10000.println("Hard Drive 1: " + var10001 + ", Capacity: " + hardDrive1.getCapacityGB() + "GB, Price: " + hardDrive1.getPrice() + "$");
    var10000 = System.out;
    var10001 = hardDrive2.getModel();
    var10000.println("Hard Drive 2: " + var10001 + ", Capacity: " + hardDrive2.getCapacityGB() + "GB, Price: " + hardDrive2.getPrice() + "$");
    var10000 = System.out;
    var10001 = hardDrive3.getModel();
    var10000.println("Hard Drive 3: " + var10001 + ", Capacity: " + hardDrive3.getCapacityGB() + "GB, Price: " + hardDrive3.getPrice() + "$");
    var10000 = System.out;
    var10001 = hardDrive4.getModel();
    var10000.println("Hard Drive 4: " + var10001 + ", Capacity: " + hardDrive4.getCapacityGB() + "GB, Price: " + hardDrive4.getPrice() + "$");
    var10000 = System.out;
    var10001 = hardDrive5.getModel();
    var10000.println("Hard Drive 5: " + var10001 + ", Capacity: " + hardDrive5.getCapacityGB() + "GB, Price: " + hardDrive5.getPrice() + "$");
    var10000 = System.out;
    var10001 = graphicsCard1.getModel();
    var10000.println("Graphics Card 1: " + var10001 + ", Memory: " + graphicsCard1.getMemoryGB() + "GB, Price: " + graphicsCard1.getPrice() + "$");
    var10000 = System.out;
    var10001 = graphicsCard2.getModel();
    var10000.println("Graphics Card 2: " + var10001 + ", Memory: " + graphicsCard2.getMemoryGB() + "GB, Price: " + graphicsCard2.getPrice() + "$");
    var10000 = System.out;
    var10001 = graphicsCard4.getModel();
    var10000.println("Graphics Card 3: " + var10001 + ", Memory: " + graphicsCard3.getMemoryGB() + "GB, Price: " + graphicsCard3.getPrice() + "$");
    var10000 = System.out;
    var10001 = graphicsCard4.getModel();
    var10000.println("Graphics Card 4: " + var10001 + ", Memory: " + graphicsCard4.getMemoryGB() + "GB, Price: " + graphicsCard4.getPrice() + "$");
    var10000 = System.out;
    var10001 = graphicsCard5.getModel();
    var10000.println("Graphics Card 5: " + var10001 + ", Memory: " + graphicsCard5.getMemoryGB() + "GB, Price: " + graphicsCard5.getPrice() + "$");
    var10000 = System.out;
    var10001 = processor1.getModel();
    var10000.println("Processor 1: " + var10001 + ", Price: " + processor1.getPrice() + "$");
    var10000 = System.out;
    var10001 = processor2.getModel();
    var10000.println("Processor 2: " + var10001 + ", Price: " + processor2.getPrice() + "$");
    var10000 = System.out;
    var10001 = processor5.getModel();
    var10000.println("Processor 3: " + var10001 + ", Price: " + processor3.getPrice() + "$");
    var10000 = System.out;
    var10001 = processor4.getModel();
    var10000.println("Processor 4: " + var10001 + ", Price: " + processor4.getPrice() + "$");
    var10000 = System.out;
    var10001 = processor5.getModel();
    var10000.println("Processor 5: " + var10001 + ", Price: " + processor5.getPrice() + "$");
    var10000 = System.out;
    var10001 = motherboard1.getModel();
    var10000.println("Motherboard 1: " + var10001 + ", Price: " + motherboard1.getPrice() + "$");
    var10000 = System.out;
    var10001 = motherboard2.getModel();
    var10000.println("Motherboard 2: " + var10001 + ", Price: " + motherboard2.getPrice() + "$");
    var10000 = System.out;
    var10001 = motherboard3.getModel();
    var10000.println("Motherboard 3: " + var10001 + ", Price: " + motherboard3.getPrice() + "$");
    var10000 = System.out;
    var10001 = motherboard4.getModel();
    var10000.println("Motherboard 4: " + var10001 + ", Price: " + motherboard4.getPrice() + "$");
    var10000 = System.out;
    var10001 = motherboard5.getModel();
    var10000.println("Motherboard 5: " + var10001 + ", Price: " + motherboard5.getPrice() + "$");
    System.out.println("Power Supplies:");
    var10000 = System.out;
    var10001 = powerSupply1.getModel();
    var10000.println("Power Supply 1: " + var10001 + ", Wattage: " + powerSupply1.getWattage() + ", Price: " + powerSupply1.getPrice() + "$");
    var10000 = System.out;
    var10001 = powerSupply2.getModel();
    var10000.println("Power Supply 2: " + var10001 + ", Wattage: " + powerSupply2.getWattage() + ", Price: " + powerSupply2.getPrice() + "$");
    var10000 = System.out;
    var10001 = powerSupply3.getModel();
    var10000.println("Power Supply 3: " + var10001 + ", Wattage: " + powerSupply3.getWattage() + ", Price: " + powerSupply3.getPrice() + "$");
    var10000 = System.out;
    var10001 = powerSupply4.getModel();
    var10000.println("Power Supply 4: " + var10001 + ", Wattage: " + powerSupply4.getWattage() + ", Price: " + powerSupply4.getPrice() + "$");
    var10000 = System.out;
    var10001 = powerSupply5.getModel();
    var10000.println("Power Supply 5: " + var10001 + ", Wattage: " + powerSupply5.getWattage() + ", Price: " + powerSupply5.getPrice() + "$");
    Scanner scanner = new Scanner(System.in);
    System.out.println("Select a Motherboard:");
    System.out.println("1. " + motherboard1.getModel());
    System.out.println("2. " + motherboard2.getModel());
    System.out.println("3. " + motherboard3.getModel());
    System.out.println("4. " + motherboard4.getModel());
    System.out.println("5. " + motherboard5.getModel());
    System.out.print("Enter the number of the selected Motherboard: ");
    Motherboard chosenMotherboard = null;
    Processor chosenProcessor = null;
    HardDrive chosenHardDrive = null;
    RAM chosenRAM = null;
    GraphicsCard chosenGraphicsCard = null;
    PowerSupply chosenPowerSupply = null;
    CoolingSystem chosenCoolingSystem = null;

    while(!scanner.hasNextInt()) {
      System.out.println("Invalid input. Please enter a number.");
      scanner.nextLine();
    }

    int selectedMotherboard = scanner.nextInt();
    switch (selectedMotherboard) {
      case 1:
        chosenMotherboard = motherboard1;
        break;
      case 2:
        chosenMotherboard = motherboard2;
        break;
      case 3:
        chosenMotherboard = motherboard3;
        break;
      case 4:
        chosenMotherboard = motherboard4;
        break;
      case 5:
        chosenMotherboard = motherboard5;
        break;
      default:
        System.out.println("Invalid selection. Exiting.");
        System.exit(0);
    }

    var10000 = System.out;
    var10001 = chosenMotherboard.getModel();
    var10000.println("Selected Motherboard: " + var10001 + ", SocketType: " + chosenMotherboard.getSocketType() + ", Price: " + chosenMotherboard.getPrice());
    System.out.println("Select a Processor:");
    System.out.println("1. " + processor1.getModel());
    System.out.println("2. " + processor2.getModel());
    System.out.println("3. " + processor3.getModel());
    System.out.println("4. " + processor4.getModel());
    System.out.println("5. " + processor5.getModel());

    int selectedHardDrive;
    while(chosenProcessor == null || chosenMotherboard.getSocketType().equals("LGA1200") && chosenProcessor.getTypeClass().equals("AMD")) {
      System.out.print("Enter the number of the selected Processor: ");

      while(!scanner.hasNextInt()) {
        System.out.println("Invalid input. Please enter a number.");
        scanner.nextLine();
      }

      selectedHardDrive = scanner.nextInt();
      switch (selectedHardDrive) {
        case 1:
          chosenProcessor = processor1;
          break;
        case 2:
          chosenProcessor = processor2;
          break;
        case 3:
          chosenProcessor = processor3;
          break;
        case 4:
          chosenProcessor = processor4;
          break;
        case 5:
          chosenProcessor = processor5;
          break;
        default:
          System.out.println("Invalid selection. Exiting.");
          System.exit(0);
      }

      if (chosenMotherboard.getSocketType().equals("LGA1200") && chosenProcessor.getTypeClass().equals("AMD")) {
        System.out.println("Warning: Selected processor is AMD, but the motherboard socket type is LGA. Please choose a different processor or motherboard.");
        chosenProcessor = null;
      }

      if (chosenMotherboard.getSocketType().equals("AM4") && chosenProcessor.getTypeClass().equals("Intel")) {
        System.out.println("Warning: Selected processor is Intel, but the motherboard socket type is AM4. Please choose a different processor or motherboard.");
        chosenProcessor = null;
      }
    }

    var10000 = System.out;
    var10001 = chosenProcessor.getModel();
    var10000.println("Selected Processor: " + var10001 + ", Price: " + chosenProcessor.getPrice());
    System.out.println("Select a Hard Drive:");
    System.out.println("1. " + hardDrive1.getModel());
    System.out.println("2. " + hardDrive2.getModel());
    System.out.println("3. " + hardDrive3.getModel());
    System.out.println("4. " + hardDrive4.getModel());
    System.out.println("5. " + hardDrive5.getModel());
    System.out.print("Enter the number of the selected Hard Drive: ");

    while(!scanner.hasNextInt()) {
      System.out.println("Invalid input. Please enter a number.");
      scanner.nextLine();
    }

    selectedHardDrive = scanner.nextInt();
    switch (selectedHardDrive) {
      case 1:
        chosenHardDrive = hardDrive1;
        break;
      case 2:
        chosenHardDrive = hardDrive2;
        break;
      case 3:
        chosenHardDrive = hardDrive3;
        break;
      case 4:
        chosenHardDrive = hardDrive4;
        break;
      case 5:
        chosenHardDrive = hardDrive5;
        break;
      default:
        System.out.println("Invalid selection. Exiting.");
        System.exit(0);
    }

    var10000 = System.out;
    var10001 = chosenHardDrive.getModel();
    var10000.println("Selected Hard Drive: " + var10001 + ", Capacity: " + chosenHardDrive.getCapacityGB() + "GB, Price: " + chosenHardDrive.getPrice());
    System.out.println("Select a RAM:");
    System.out.println("1. " + ram1.getModel());
    System.out.println("2. " + ram2.getModel());
    System.out.println("3. " + ram3.getModel());
    System.out.println("4. " + ram4.getModel());
    System.out.println("5. " + ram5.getModel());
    System.out.print("Enter the number of the selected RAM: ");

    while(!scanner.hasNextInt()) {
      System.out.println("Invalid input. Please enter a number.");
      scanner.nextLine();
    }

    int selectedRAM = scanner.nextInt();
    switch (selectedRAM) {
      case 1:
        chosenRAM = ram1;
        break;
      case 2:
        chosenRAM = ram2;
        break;
      case 3:
        chosenRAM = ram3;
        break;
      case 4:
        chosenRAM = ram4;
        break;
      case 5:
        chosenRAM = ram5;
        break;
      default:
        System.out.println("Invalid selection. Exiting.");
        System.exit(0);
    }

    System.out.println("Enter count of RAM: ");

    while(true) {
      while(scanner.hasNextInt()) {
        int userCountRAMInput = scanner.nextInt();
        if (userCountRAMInput <= chosenMotherboard.getRamCountSlot()) {
          var10000 = System.out;
          var10001 = chosenRAM.getModel();
          var10000.println("Selected RAM: " + var10001 + ", Capacity: " + chosenRAM.getCapacityGB() + "GB, Price: " + chosenRAM.getPrice() * (double)userCountRAMInput);
          String userNeedPowerSupplyChoice = scanner.nextLine();
          System.out.println("Select a Power Supply:");
          System.out.println("1. " + powerSupply1.getModel());
          System.out.println("2. " + powerSupply2.getModel());
          System.out.println("3. " + powerSupply3.getModel());
          System.out.println("4. " + powerSupply4.getModel());
          System.out.println("5. " + powerSupply5.getModel());
          System.out.print("Enter the number of the selected Power Supply: ");

          while(!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
          }

          int selectedPowerSupply = scanner.nextInt();
          switch (selectedPowerSupply) {
            case 1:
              chosenPowerSupply = powerSupply1;
              break;
            case 2:
              chosenPowerSupply = powerSupply2;
              break;
            case 3:
              chosenPowerSupply = powerSupply3;
              break;
            case 4:
              chosenPowerSupply = powerSupply4;
              break;
            case 5:
              chosenPowerSupply = powerSupply5;
              break;
            default:
              System.out.println("Invalid selection. Exiting.");
              System.exit(0);
          }

          var10000 = System.out;
          var10001 = chosenPowerSupply.getModel();
          var10000.println("Selected Power Supply: " + var10001 + ", Wattage: " + chosenPowerSupply.getWattage() + "W, Price: " + chosenPowerSupply.getPrice());
          System.out.println("Select a Cooling System:");
          System.out.println("1. " + coolingSystem1.getModel());
          System.out.println("2. " + coolingSystem2.getModel());
          System.out.println("3. " + coolingSystem3.getModel());
          System.out.println("4. " + coolingSystem4.getModel());
          System.out.println("5. " + coolingSystem5.getModel());
          System.out.print("Enter the number of the selected Cooling System: ");

          while(!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
          }

          int selectedCoolingSystem = scanner.nextInt();
          switch (selectedCoolingSystem) {
            case 1:
              chosenCoolingSystem = coolingSystem1;
              break;
            case 2:
              chosenCoolingSystem = coolingSystem2;
              break;
            case 3:
              chosenCoolingSystem = coolingSystem3;
              break;
            case 4:
              chosenCoolingSystem = coolingSystem4;
              break;
            case 5:
              chosenCoolingSystem = coolingSystem5;
              break;
            default:
              System.out.println("Invalid selection. Exiting.");
              System.exit(0);
          }

          var10000 = System.out;
          var10001 = chosenCoolingSystem.getModel();
          var10000.println("Selected Cooling System: " + var10001 + ", Type: " + chosenCoolingSystem.getType() + ", Fan Speed: " + chosenCoolingSystem.getFanSpeed() + ", Price: " + chosenCoolingSystem.getPrice());
          System.out.print("Do you want to select a Graphics Card? (Y/N): ");
          scanner.nextLine();
          String userNeedGraphCardChoice = scanner.nextLine();
          if (userNeedGraphCardChoice.equalsIgnoreCase("Y")) {
            System.out.println("Select a Graphics Card:");
            System.out.println("1. " + graphicsCard1.getModel());
            System.out.println("2. " + graphicsCard2.getModel());
            System.out.println("3. " + graphicsCard3.getModel());
            System.out.println("4. " + graphicsCard4.getModel());
            System.out.println("5. " + graphicsCard5.getModel());
            System.out.print("Enter the number of the selected Graphics Card: ");

            while(!scanner.hasNextInt()) {
              System.out.println("Invalid input. Please enter a number.");
              scanner.nextLine();
            }

            int selectedGraphicsCard = scanner.nextInt();
            switch (selectedGraphicsCard) {
              case 1:
                chosenGraphicsCard = graphicsCard1;
                break;
              case 2:
                chosenGraphicsCard = graphicsCard2;
                break;
              case 3:
                chosenGraphicsCard = graphicsCard3;
                break;
              case 4:
                chosenGraphicsCard = graphicsCard4;
                break;
              case 5:
                chosenGraphicsCard = graphicsCard5;
                break;
              default:
                System.out.println("Invalid selection. Exiting.");
                System.exit(0);
            }

            var10000 = System.out;
            var10001 = chosenGraphicsCard.getModel();
            var10000.println("Selected Graphics Card: " + var10001 + ", Memory: " + chosenGraphicsCard.getMemoryGB() + "GB, Price: " + chosenGraphicsCard.getPrice());
            double totalPrice = chosenMotherboard.getPrice() + chosenRAM.getPrice() * (double)userCountRAMInput + chosenHardDrive.getPrice() + chosenProcessor.getPrice() + chosenGraphicsCard.getPrice() + chosenPowerSupply.getPrice() + (double)chosenCoolingSystem.getPrice();
            var10000 = System.out;
            var10001 = chosenMotherboard.getModel();
            var10000.println("-------------------------------------------------------\nTotal choosings:\n1) MotherBoard: " + var10001 + ", Socket type: " + chosenMotherboard.getSocketType() + ", Ram count slot: " + chosenMotherboard.getRamCountSlot() + ", Price: " + chosenMotherboard.getPrice() + "\n2) Processor: " + chosenProcessor.getModel() + ", ClockSpeed: " + chosenProcessor.getClockSpeed() + ", Cores: " + chosenProcessor.getCores() + ", Price: " + chosenProcessor.getPrice() + "\n3) Hard Drive: " + chosenHardDrive.getModel() + ", Capacity: " + chosenHardDrive.getCapacityGB() + ", Price: " + chosenHardDrive.getPrice() + "\n4) RAM: " + chosenRAM.getModel() + ", Capacity: " + chosenRAM.getCapacityGB() + ", Speed (MHz): " + chosenRAM.getSpeedMHz() + ", Price per unit: " + chosenRAM.getPrice() + ", Count: " + userCountRAMInput + ", Total Price: " + chosenRAM.getPrice() * (double)userCountRAMInput + "\n5) Graphics Card: " + chosenGraphicsCard.getModel() + ", Memory: " + chosenGraphicsCard.getMemoryGB() + ", Price: " + chosenGraphicsCard.getPrice() + "\n6) Power Supply: " + chosenPowerSupply.getModel() + ", Wattage: " + chosenPowerSupply.getWattage() + "W, Price: " + chosenPowerSupply.getPrice() + "\n7) Cooling System: " + chosenCoolingSystem.getModel() + ", Type: " + chosenCoolingSystem.getType() + ", Fan Speed: " + chosenCoolingSystem.getFanSpeed() + ", Price: " + chosenCoolingSystem.getPrice() + "\n ------------------------------------------------------- \n Total buying price: " + totalPrice + "$");
          } else if (userNeedGraphCardChoice.equalsIgnoreCase("N")) {
            double totalPrice = chosenMotherboard.getPrice() + chosenRAM.getPrice() * (double)userCountRAMInput + chosenHardDrive.getPrice() + chosenProcessor.getPrice() + chosenPowerSupply.getPrice() + (double)chosenCoolingSystem.getPrice();
            System.out.println("We dont need Graphic card. Exiting.");
            var10000 = System.out;
            var10001 = chosenMotherboard.getModel();
            var10000.println("-------------------------------------------------------\nTotal choosings:\n1) MotherBoard: " + var10001 + ", Socket type: " + chosenMotherboard.getSocketType() + ", Ram count slot: " + chosenMotherboard.getRamCountSlot() + ", Price: " + chosenMotherboard.getPrice() + "\n2) Processor: " + chosenProcessor.getModel() + ", ClockSpeed: " + chosenProcessor.getClockSpeed() + ", Cores: " + chosenProcessor.getCores() + ", Price: " + chosenProcessor.getPrice() + "\n3) Hard Drive: " + chosenHardDrive.getModel() + ", Capacity: " + chosenHardDrive.getCapacityGB() + ", Price: " + chosenHardDrive.getPrice() + "\n4) RAM: " + chosenRAM.getModel() + ", Capacity: " + chosenRAM.getCapacityGB() + ", Speed (MHz): " + chosenRAM.getSpeedMHz() + ", Price per unit: " + chosenRAM.getPrice() + ", Count: " + userCountRAMInput + ", Total Price: " + chosenRAM.getPrice() * (double)userCountRAMInput + "\n5) Power Supply: " + chosenPowerSupply.getModel() + ", Wattage: " + chosenPowerSupply.getWattage() + "W, Price: " + chosenPowerSupply.getPrice() + "\n6) Cooling System: " + chosenCoolingSystem.getModel() + ", Type: " + chosenCoolingSystem.getType() + ", Fan Speed: " + chosenCoolingSystem.getFanSpeed() + ", Price: " + chosenCoolingSystem.getPrice() + "\n ------------------------------------------------------- \n  Total buying price: " + totalPrice + "$");
          } else {
            System.out.println("Invalid input. Exiting.");
            System.exit(0);
          }

          scanner.close();
          return;
        }

        System.out.println("Count of RAM exceeds the number of motherboard RAM slots. Please enter a valid count.");
      }

      System.out.println("Invalid input. Please enter a number.");
      scanner.nextLine();
    }
  }
}
