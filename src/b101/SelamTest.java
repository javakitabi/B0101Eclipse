
package b101;

/**
 * Selam s�n�f� tipinde bir nesne olu�turur ve o nesneden bir hizmet(metod) �a��r�r. 
 * �a��r�lan hizmetten(metoddan) geriye d�nen de�eri ekrana yazd�r�r.
 *  
 * 
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * Daha fazla bilgi i�in @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * </p>
 * @see <a href="http://www.javakitabi.com">JavaKitabi.com</a>
 */

public class SelamTest {
	/**
	 * T�m sistemin �al��mas�n� <code>main</code> metot ba�lat�r. 
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
