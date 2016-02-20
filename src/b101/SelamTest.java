
package b101;

/**
 * Selam sýnýfý tipinde bir nesne oluþturur ve o nesneden bir hizmet(metod) çaðýrýr. 
 * Çaðýrýlan hizmetten(metoddan) geriye dönen deðeri ekrana yazdýrýr.
 *  
 * 
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * Daha fazla bilgi için @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * </p>
 * @see <a href="http://www.javakitabi.com">JavaKitabi.com</a>
 */

public class SelamTest {
	/**
	 * Tüm sistemin çalýþmasýný <code>main</code> metot baþlatýr. 
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Selam ornek = new Selam();
		
		String cevap = ornek.selamSoyle("Ali");
		
		System.out.println(cevap);
		
		
	}
}
