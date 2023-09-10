package yuval;
public class rec_1 {
		
		public static int sum_1(int num) {
			if (num == 1)
				return 1;
			
			else
				return sum_1(num - 1) + num;
		}

		
		
		
		public static int azeret_2(int n) {
			if (n <= 0)
				return 1;
			
			else
				return n *azeret_2(n-1);
		}
		
		
		
		
		public static int q3(int n) {
			if (n == 1)
				return 1;
			
			if(n%2 != 0)
				return n *q3(n-2);
			
			else {
				n=n+1;
				return n* q3(n-2); 
			}
		}
		
		
		public static int q_4(int n) {
			if (n < 10)
				return 1;
			
			else
				return 1 + q_4(n/10);
		}
		
		
		
		public static int q_5(int n1, int n2) {
			if (n1 <= 0)
				return 0;
			
			else
				return 1 + q_5(n1-n2, n2);
		}
		
		

		
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub


			System.out.println(sum_1(3));
			System.out.println(azeret_2(3));
			System.out.println(q3(3));
			System.out.println("this number has: "+ q_4(35)+ " digits");
			System.out.println("The result of the division is: " + q_5(10, 2));

		}

	}
