package online.zhaopei.myproject.common.tool.test;

import org.junit.Test;

import online.zhaopei.myproject.common.tool.RSATool;

public class RSAToolTest {

	@Test
	public void test() throws Exception {
		String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDI09TU5xKVHmm74jF/Vi0mpKPF\r" +
				"lUxzi/9qIAuEoOZN5vm/tyC0FM1jRSudxC8bRHlZgo60qy6U2GQWvVguMtwrWWvQ\r" +
				"hx6lCYcFD7Bqa0XVZDmlv/ZgeY+3KRSk5mOPX0InatkPQbqmE5E1UB6/dOX7tMXH\r" +
				"kDd2bI6neZOqyAXZ6wIDAQAB\r";
			
		String privateKey = "MIICeAIBADANBgkqhkiG9w0BAQEFAASCAmIwggJeAgEAAoGBAMjT1NTnEpUeabvi\r" +
				"MX9WLSako8WVTHOL/2ogC4Sg5k3m+b+3ILQUzWNFK53ELxtEeVmCjrSrLpTYZBa9\r" +
				"WC4y3CtZa9CHHqUJhwUPsGprRdVkOaW/9mB5j7cpFKTmY49fQidq2Q9BuqYTkTVQ\r" +
				"Hr905fu0xceQN3Zsjqd5k6rIBdnrAgMBAAECgYEAhkRZ/x2eZuQ2fM71mNTcywE4\r" +
				"HVl8C6SF10YlbT7Fuz+5qludGcjuqHgOeSQ4+loFZ7rJ/jCUrB8gi7N7ySdn2sJ/\r" +
				"u7TjcjkF1BBjWkY9jFfX3VpgrclBJznmeiaXY6ds0tmasqTdGu8yshp2wYpjLyoW\r" +
				"oZmEK/afIKwCYxsbvEECQQD+CWsZyEU1lhq62+cQWy7Wlz+N0BOXqkNIbcdDdiob\r" +
				"f0mNum8bAWNzW8S0biR4my6mlDHvZmy9Zbka4ryHdKKHAkEAymElCbDSvNnLrgPk\r" +
				"kSMZOVX+gu3uCKaVU4H2qPKqBwq9qx8FfPZOGVQMLbQWa+27E30AtfTbKSK3/eto\r" +
				"onMSfQJAdSy49vJ2YeozuB74bIXyi87F5M6mSt2hHUZtlANsFrTWo4Xr+6PfUHVy\r" +
				"vNrU/cBuey19/vPakl3aTLlqxnwY/wJBALV5POweqin8Jt9I0FmxHnpCeXHQhwUs\r" +
				"03RJcvR2fS7JW+CpdZNjjg66Rh1pgj2PtJQ6IDwJb8jIQDKqOG6LP0UCQQC/O4Vc\r" +
				"+5PTur6iO+mHQuJ2eizIeKYlvdSj737NOTRjsc18XZoIPd9zRPdhSg0OyMkJ/EWX\r" +
				"EXx2Bqu4Nc2LYcyV\r";
			
		String ming = "123456";

		String encrypt = RSATool.encryptByPublicKey(ming, RSATool.loadPublicKeyByStr(publicKey));

		System.out.println("公钥加密后：" + encrypt);

		String decrypt = RSATool.decryptByPrivateKey(encrypt, RSATool.loadPrivateKeyByStr(privateKey));

		System.out.println("么钥解密后：" + decrypt);
	}

}
