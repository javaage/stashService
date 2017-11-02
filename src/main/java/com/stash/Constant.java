/**
 * 
 */
package com.stash;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

/**
 * @author P9030576
 *
 */
public class Constant {
	public static final String URL_INDEX_RECORD = "https://hq.sinajs.cn/list=sz399001,sh000001,sz399006,sz399005,sz399678,sz399959,sz399991,sz399232,sz399239,sz399240,sz399806,sz399803,sz399417,sz399441,sz399807,sz399814";

	public static String httpsRequest(String requestUrl, String method, String outputStr, Map<String, String> headers)
			throws Exception {
		
		try {
			URL url = new URL(requestUrl);
			HttpsURLConnection httpUrlConn = (HttpsURLConnection) url.openConnection();
			
			if (null != headers) {
				for (String key : headers.keySet()) {
					httpUrlConn.setRequestProperty(key, headers.get(key));
				}
			}

			if (!method.equals("GET")) {
				httpUrlConn.setDoOutput(true);
				httpUrlConn.setDoInput(true);
			}

			httpUrlConn.setRequestMethod(method);
			httpUrlConn.connect();

			if (outputStr != null) {
				DataOutputStream out = new DataOutputStream(httpUrlConn.getOutputStream());
				out.writeBytes(outputStr);
				out.flush();
				out.close();
			}

			StringBuffer buffer = new StringBuffer();
			BufferedReader reader = new BufferedReader(new InputStreamReader(httpUrlConn.getInputStream(),"GBK"));
			String line;
			while ((line = reader.readLine()) != null) {
				buffer.append(line);
			}
			reader.close();
			
			httpUrlConn.disconnect();
			return buffer.toString();
		} catch (Exception ex) {
			throw ex;
		}
	}
}
