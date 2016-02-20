
package b101;

/**
 * <code>world</code> ad�nda bir veriyi ve String bir de�er 
 * d�nd�ren <code>selamSoyle</code> ad�nda bir hizmeti(metodu) sarmalar. 
 * E�er <code>Selam</code> s�n�f� tipinde bir nesne olu�turup, ona <code>selamSoyle</code> 
 * deyip <code>kime</code> bilgisini ge�ersek o ki�iye selam s�yler. 
 *
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha fazla bilgi i�in @see
 *         <a href="http://www.javaturk.org" target="_blank">http://www.javaturk.org</a>
 *         </p>
 * @see <a href="http://www.javakitabi.com" target="_blank">JavaKitabi.com</a>
 * 
 */
public class Selam {

	/**
	 * 
	 */
	private String world = "millet";
	
	
	/**
	 * Kendisine parametre olarak g�nderilen veya ge�ilen ki�iye selam s�yler ve
	 * selam c�mlesini geriye verir.
	 * @param kime 
	 * 		  Selam s�ylemek istedi�imiz ki�idir.
	 * 
	 * @return cumle 
	 * 		   �stedi�imiz ki�iye selam s�yler ve selam c�mlesini bize geri verir.
	 */
	public String selamSoyle(String kime) {

		String cumle;
		if (kime != "")
			cumle = "Selam " + kime + " :)";
		else
			cumle = "Selam " + world + " :)";
		
		return cumle;
	}
}
