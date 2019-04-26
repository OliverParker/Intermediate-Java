//package FactoryStuff;
//
//public class RegistrationPlateFactory {
//	private static String[] regPlates 
//	  = { "B1G 805S", "BE61 NER", "FR0 5TY", "HNZ57","CHA 210T", "JB007", "FA12 COP" };
//
//	private static int nextAvailablePlate = 0;
//
//	public static RegistrationPlate produceNextRegistrationPlate() {
//		if (nextAvailablePlate < regPlates.length) {
//			String reg = regPlates[nextAvailablePlate];
//			RegistrationPlate rp = new RegistrationPlate(reg);
//			nextAvailablePlate++;
//			return rp;
//			// or
//			// return new RegistrationPlate(regPlates[nextAvailablePlate++]);
//		} else {
//			return new RegistrationPlate("XXXX");
//		}
//
//	}
//}
