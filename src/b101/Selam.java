
package b101;

/**
 * <code>world</code> adýnda bir veriyi ve String bir deðer 
 * döndüren <code>selamSoyle</code> adýnda bir hizmeti(metodu) sarmalar. 
 * Eðer <code>Selam</code> sýnýfý tipinde bir nesne oluþturup, ona <code>selamSoyle</code> 
 * deyip <code>kime</code> bilgisini geçersek o kiþiye selam söyler. 
 *
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha fazla bilgi için @see
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
	 * Kendisine parametre olarak gönderilen veya geçilen kiþiye selam söyler ve
	 * selam cümlesini geriye verir.
	 * @param kime 
	 * 		  Selam söylemek istediðimiz kiþidir.
	 * 
	 * @return cumle 
	 * 		   Ýstediðimiz kiþiye selam söyler ve selam cümlesini bize geri verir.
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
