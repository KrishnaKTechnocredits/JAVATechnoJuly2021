package elizabeth_Assignment_53;

class Assignment53{
	
	void getPattern1(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void getPattern2(int n){
		for(int i=n;i>=0;i--){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	void getPattern3(int n){
		for (int i=0; i<n; i++)   
		{  
			int j;
			for (j=n-i;j>1;j--)   
			{  
				System.out.print(" ");   
			} 
			for (j=0; j<=i; j++ )   
			{    
				System.out.print("* ");   
			}   
			System.out.println();   
		} 
	}
	
	
	void getPattern4(int n){
		for (int i=0; i<n; i++)   
		{  
			//int j;
			for (int j=0;j<=i;j++)   
			{  
				System.out.print(" ");   
			} 
			for (int j=0; j<=(n-1)-i; j++ )   
			{    
				System.out.print("* ");   
			}   
			System.out.println();   
		} 
	}
	
	void getPattern5(int n){
		for (int i=0; i<n; i++)   
		{  
			int j;
			for (j=n-i;j>1;j--)   
			{  
				System.out.print(" ");   
			} 
			for (j=0; j<=i; j++ )   
			{    
				System.out.print("* ");   
			}   
			System.out.println();   
		} 
		
		for (int i=n-1; i>=1; i--)   
		{  
			int j;
			for (j=n-i;j>=1;j--)   
			{  
				System.out.print(" ");   
			} 
			for (j=0; j<=i-1; j++ )   
			{    
				System.out.print("* ");   
			}   
			System.out.println();   
		} 
	}
	
	void getPattern6(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=n-1;i>=0;i--){
			for(int j=1;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void getPattern7(int n){
		for(int i=1;i<=n;i++){
			int j;
			for(j=2*(n-i);j>=1;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){	
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void getPattern8(int n){
		for(int i=n;i>=1;i--){
			int j;
			for(j=2*(n-i);j>=1;j--){
				System.out.print(" ");
			}
			for(j=1;j<=i;j++){	
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	void getPattern9(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	void getPattern10(int n){
		for(int i=n;i>=1;i--){
			for(int j=n;j>=i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	void getPattern11(int n){
		for(int i=1;i<=n;i++){
			for(int j=i;j>=1;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	void getPattern12(int n){
		int temp=0;
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				temp=1;
			}else{
				temp=0;
			}
			for(int j=1;j<=n;j++){
				System.out.print(temp);
				if(temp==1){
					temp=0;
				}else{
					temp=1;
				}
			}
			
			System.out.println();
		}
	}
	
	
	
	void getPattern13(int n){
		int temp=65;
		for(int i=0;i<n;i++){
			for(int j=0;j<=i;j++){
				System.out.print((char)(temp+j));
			}
			
			System.out.println();
		}
	}
	
	void getPattern14(int n){
		int temp=65;
		int temp1=97;
		for(int i=0;i<n;i++){
			if(i%2!=0){
				for(int j=0;j<=i;j++){
					System.out.print((char)(temp1+j));
				}
			}else{
				for(int j=0;j<=i;j++){
					System.out.print((char)(temp+j));
				}
			}
			System.out.println();
		}
	}
	
	void getPattern15(int n){
		int temp=65;
		int count=1;
		for(int i=0;i<n;i++){
			for(int j=0;j<2*n;j++){
				if(j%2==0){
					System.out.print(count++);
				}else{
					System.out.print((char)(temp++));
				}
			}
		System.out.println();
		}
	}
	
	public static void main(String[] args){
		Assignment53 assignment53=new Assignment53();
		System.out.println("-------Pattern1--------");
		assignment53.getPattern1(4);
		System.out.println("-------Pattern2--------");
		assignment53.getPattern2(4);
		System.out.println("-------Pattern3--------");
		assignment53.getPattern3(4);
		System.out.println("-------Pattern4--------");
		assignment53.getPattern4(4);
		System.out.println("-------Pattern5--------");
		assignment53.getPattern5(4);
		System.out.println("-------Pattern6--------");
		assignment53.getPattern6(4);
		System.out.println("-------Pattern7--------");
		assignment53.getPattern7(4);
		System.out.println("-------Pattern8--------");
		assignment53.getPattern8(4);
		System.out.println("-------Pattern9--------");
		assignment53.getPattern9(4);
		System.out.println("-------Pattern10--------");
		assignment53.getPattern10(4);
		System.out.println("-------Pattern11--------");
		assignment53.getPattern11(4);
		System.out.println("-------Pattern12--------");
		assignment53.getPattern12(4);
		System.out.println("-------Pattern13--------");
		assignment53.getPattern13(4);
		System.out.println("-------Pattern14--------");
		assignment53.getPattern14(4);
		System.out.println("-------Pattern15--------");
		assignment53.getPattern15(3);
		
		
	}
}