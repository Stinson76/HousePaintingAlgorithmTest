import java.util.Scanner;
public class HousePaintingAlgorithmTest {

	public static void main(String[] args) {
		Scanner abc = new Scanner (System.in);
		
		//Please enter the length of the building
		System.out.println("Enter Length");
		int BuildingLength = abc.nextInt();
		
		//Please enter the width of the building
		System.out.println("Enter Width");
		int BuildingWidth = abc.nextInt();
		
		//Please enter the height building 
		System.out.println("Enter Height ");
		int BuildingHeigth = abc.nextInt();
		
		// Please enter the length for a window
		System.out.println("Enter Window Length");
		int WindowLength = abc.nextInt();
		
		// Please enter the width for a window
		System.out.println("Enter Window Width");
		int WindowWidth = abc.nextInt();
		
		// Please enter the number of Window
		System.out.println("Window count");
		int WindowCount = abc.nextInt();
		
		// Please enter the number of Door
		System.out.println("Door count");
		int DoorCount = abc.nextInt();
		
		// Please enter the Length of the Door
		System.out.println("Door Length");
		int DoorLength =abc.nextInt();
		
		// Please enter the Width of the Door
		System.out.println("Door Width");
		int DoorWidth =abc.nextInt();
		
		// Please enter a Normal Side Count
		System.out.println("Normal Side Count");
		int NormalSideCount = abc.nextInt();
		
		// Please enter a Peak Side Count
		System.out.println("Peak Side Count");
		int PeakSideCount = abc.nextInt();
		
		// Please enter Cost per Square foot
		System.out.println("Cost Per Square Foot");
		int CostPerSqFt = abc.nextInt();
		
		//Compute Door Square Foot
		int DoorSquareFoot=2*(DoorWidth*DoorLength);
		System.out.println("Door Square Foot"+DoorSquareFoot);
		
		// Compute Window Square Footage
		int WindowSquareFoot =10*(WindowLength*WindowWidth);
		System.out.println("Window Square Foot"+ WindowSquareFoot);
						
		//Compute Building Peak Side
		int BuildingPeakSide=PeakSideCount*(BuildingLength*BuildingWidth)+(BuildingHeigth-BuildingWidth)*(BuildingLength);
		System.out.println("Building Peak Side"+ BuildingPeakSide);
		
		//Compute Building Normal Side
		int BuildingNormalSide = (NormalSideCount)*(BuildingLength*BuildingWidth);
		System.out.println("Building Normal Side"+ BuildingNormalSide);
		
		//Compute Square Footage
		int SqFt = ((BuildingNormalSide+BuildingPeakSide)-(WindowSquareFoot+DoorSquareFoot));
		System.out.println("Square Foot"+ SqFt);
		
		//Compute Painting Cost
		int PaintingCost= SqFt*CostPerSqFt;
		System.out.println("Painting Cost"+ PaintingCost);
		abc.close();


  }}
