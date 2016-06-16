package wcmc.hef.general.util;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class RedUtil {

	public static byte[] consultarInternet(String strUrl) throws Exception {
    	byte[] data			= null;
    	try {
	    	URL url	= new URL(strUrl);
	    	HttpURLConnection con	= (HttpURLConnection)url.openConnection();
	    	
	    	//con.setRequestProperty ("Authorization", basicAuth);
	    	con.setRequestMethod("GET");
	    	con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:46.0) Gecko/20100101 Firefox/46.0");
	    	con.setRequestProperty("Accept", "image/png,image/*;q=0.8,*/*;q=0.5");
	    	con.setRequestProperty("Accept-Language", "es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3");
	    	con.setRequestProperty("Accept-Encoding", "gzip, deflate");
	    	con.setRequestProperty("Referer", "http://93.188.165.53/hef/home.action");
	    	con.setRequestProperty("Cookie", "NID=79=jyCeb2F0wOtXTT260w0bWGqtX53WRHU500NaU16Ep3AeJC8eLerNINJJ7e5S8sERsbNUt6tOiIlV3j_EuO-Yz9ZP3_Xf9SyH1wFwasTl2QrW_dNtUYXl8V4BsCgcsgj2FTxWn8W6f5JzaIivy2PIOldbM015sTNo2xAYTwq2Lvu4okdnCdYho05Ec2t5vP0Gkl2eT8AxR3mLXcef3gZw5XjuJj3v; OGPC=5061821-13:; SID=GwMSaNqgEjSxOSbC7MRgnbmvRyXyQCpqxzJRaYXlP8-kzNbAMfA1eaRP_glr5royvQgZYw.; HSID=Aar537HJXzZXg5pQA; APISID=bU_duMxE9jgtUCX7/AMqyGB8wHTAxkTuwD; OGP=-5061821:");
	    	con.setRequestProperty("Connection", "keep-alive");
	    	con.setRequestProperty("Cache-Control", "max-age=0");
	    	
//	    	/*
//				Host: maps.google.com
//				User-Agent: Mozilla/5.0 (Windows NT 10.0; WOW64; rv:46.0) Gecko/20100101 Firefox/46.0
//				Accept: image/png,image/*;q=0.8,*/*;q=0.5
//				Accept-Language: es-ES,es;q=0.8,en-US;q=0.5,en;q=0.3
//				Accept-Encoding: gzip, deflate
//				Referer: http://93.188.165.53/hef/home.action
//				Cookie: NID=79=jyCeb2F0wOtXTT260w0bWGqtX53WRHU500NaU16Ep3AeJC8eLerNINJJ7e5S8sERsbNUt6tOiIlV3j_EuO-Yz9ZP3_Xf9SyH1wFwasTl2QrW_dNtUYXl8V4BsCgcsgj2FTxWn8W6f5JzaIivy2PIOldbM015sTNo2xAYTwq2Lvu4okdnCdYho05Ec2t5vP0Gkl2eT8AxR3mLXcef3gZw5XjuJj3v; OGPC=5061821-13:; SID=GwMSaNqgEjSxOSbC7MRgnbmvRyXyQCpqxzJRaYXlP8-kzNbAMfA1eaRP_glr5royvQgZYw.; HSID=Aar537HJXzZXg5pQA; APISID=bU_duMxE9jgtUCX7/AMqyGB8wHTAxkTuwD; OGP=-5061821:
//				Connection: keep-alive
//				Cache-Control: max-age=0
//	    	*/
	    	con.setUseCaches(false);
	    	con.setDoInput(true);
	    	con.setDoOutput(true);
	    	
	    	con.setConnectTimeout(80000);
	    	con.setReadTimeout(80000); 
	    	InputStream in	= con.getInputStream();
	    	data	= CadenaUtil.getBytesOfInputStream(in);
	    	in.close();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
    	return data;
	}
	
}
