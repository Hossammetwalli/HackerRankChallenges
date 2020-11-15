

import java.util.Scanner;

public class VasilyTheBearAndTriangle {

	public static void main( String [] args ) {
		
				Scanner sc = new Scanner(System.in);
				System.out.println ( "Please input the opposite vertex- X & Y: " );
				
				System.out.print ( "Vertex -X = " );
				int x = sc.nextInt();
				
				System.out.print ( "Vertex -Y = " );
				int y = sc.nextInt();
				
				System.out.print(" the required points"+ requiredPoints(x, y));

				sc.close();
			}

			static String requiredPoints(int x, int y) {
				int point_A_x1;
				int point_A_y1;
				int point_C_x2;
				int point_C_y2;
				
				if (x > 0) {
					if (y > 0) {
						point_A_x1 = 0;
						point_A_y1 = x + y;
						point_C_x2 = x + y;
						point_C_y2 = 0;
					} else {
						point_A_x1 = 0;
						point_A_y1 = -x + y;
						point_C_x2 = x - y;
						point_C_y2 = 0;
					}
				} else {
					if (y > 0) {
						point_A_x1 = x - y;
						point_A_y1 = 0;
						point_C_x2 = 0;
						point_C_y2 = -x + y;
					} else {
						point_A_x1 = x + y;
						point_A_y1 = 0;
						point_C_x2 = 0;
						point_C_y2 = x + y;
					}
				}

				return String.format("%d %d %d %d", point_A_x1, point_A_y1, point_C_x2, point_C_y2);
			}
		
	}


