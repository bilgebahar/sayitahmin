public class sayitahmin{

	public static void main(String[] args){
	
		System.out.println("1 ile 100 arasında bir sayı tutun. Hangi sayı olduğunu tahmin edeceğim!");
		System.out.println("Hazır olduğunda evet yazıp enter basın."); // burada herhangi bir harf ya da kelime oyunu başlatıyor.
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextLine();
		
		int min = 1;
		int max = 100;
		
		int tahminsayisi = 0; //tahmin etme sayısı için sayaç tanımlanıyor.
		boolean done = false;
		while(!done){
			
			int guess = min + (int)(Math.random() * (max - min + 1));
			tahminsayisi++;
			
			System.out.println("Tahminim: " + guess);
			System.out.println("Doğru ise 'doğru' yazın.");
			System.out.println("Tuttuğunuz sayı " + guess + " den büyükse 'yüksek' yazın.");
			System.out.println("Tuttugunuz sayı " + guess + " den küçükse 'alçak' yazın.");
			System.out.println("Sonra entera basın.");
			
			String answer = scanner.nextLine();
						
			if(answer.equals("alçak")){ //tahmin edilen sayı tututan sayıdan yüksek ise tahmin edilen sayı düşürülüyor.
				max = guess - 1;
			}
			else if(answer.equals("yüksek")){ //tahmin edilen sayı tutulan sayıdan alçak ise tahmin edilen sayı yükseltiliyor.
				min = guess + 1;
			}
			else{ //tahmin edilen sayı doğru ise tanımlanan sayaçla birlikte çıktı yapılıp, oyuncuya teşekkür ediliyor :)
				System.out.println("Tuttuğunuz sayıyı " + tahminsayisi + " tahminde buldum. Oynadığınız için teşekkür ederim!");	
				done = true;
			}
		}
		scanner.close();
	}
} 
