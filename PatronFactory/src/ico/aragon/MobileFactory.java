package ico.aragon;

public class MobileFactory {
    
	public static Mobile createMobile(String type){
            if(type.equals(Mobile.IPHONE)){
                    return new IPhone(2, "A9", "A9 GPu");
            }else if(type.equals(Mobile.SONY)){
                    return new Sony(2, "SnapDragon 640", 16, 8);
            }else if(type.equals(Mobile.SAMSUNG)){
                    return new Samsung(4, "Qualcomm Snapdragon 821" , 12);
            }else if (type.equals(Mobile.MOTOROLA)) {
                    return new Motorola(4, "Qualcomm Snapdragon 851" , 4, 8);
            }else if (type.equals(Mobile.LG)) {
                    return new LG(2, "Qualcomm Snadragon 660", 32, 8);
            }else if (type.equals(Mobile.XIAOMI)) {
                    return new Xiaomi(4, "Qualcomm Snadragon 6835", 64, 12);
            }else{
                return null;
            }
        }
}
