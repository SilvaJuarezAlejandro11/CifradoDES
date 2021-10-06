
package des;

import java.io.*;
import javax.crypto.*;
import javax.crypto.spec.DESKeySpec;;
/**
 *
 * @author alesj
 */
public class DES {

    public void applyDES(String operacion, String clave, 
            String inputPath, String outputPath) {
        try{
            SecretKeyFactory skf = SecretKeyFactory.getInstance("DES");
            // Obtener los bits de la llave
            DESKeySpec kspec = new DESKeySpec(clave.getBytes()); 
            SecretKey ks = skf.generateSecret(kspec); 
            //Iniciar Cifrado
            Cipher cifrado = Cipher.getInstance("DES/ECB/PKCS5Padding");

            if (operacion.equals("e"))
                cifrado.init(Cipher.ENCRYPT_MODE, ks);            
            else if (operacion.equals("d"))
                cifrado.init(Cipher.DECRYPT_MODE, ks);
            else
                cifrado.init(Cipher.ENCRYPT_MODE, ks);
            
     
            InputStream archivo = new FileInputStream(inputPath);
            OutputStream fich_out = new FileOutputStream (outputPath);

            byte[] buffer = new byte[1024];
            byte[] bloque_cifrado;
            String textoCifrado = new String();
            int leidos;

            leidos = archivo.read(buffer);

            while( leidos != -1) {
                bloque_cifrado = cifrado.update(buffer,0,leidos);
                textoCifrado = textoCifrado + new String(bloque_cifrado,"ISO-8859-1");
                leidos = archivo.read(buffer);         
            }

            archivo.close();

            bloque_cifrado = cifrado.doFinal(); 
            textoCifrado = textoCifrado + new String(bloque_cifrado,"ISO-8859-1");
            System.out.println(bloque_cifrado);
            fich_out.write(textoCifrado.getBytes("ISO-8859-1"));

            
        }
        //pasar clave a la clase SecretKey
        catch(java.security.InvalidKeyException ike) {}
        catch(java.security.spec.InvalidKeySpecException ikse) {}
        catch(java.security.NoSuchAlgorithmException nsae) {}

        catch(java.io.IOException ioex) {} 
        catch (NoSuchPaddingException ex) {} 
        catch (IllegalBlockSizeException ex) {} 
        catch (BadPaddingException ex) {}

    }
    
}
    
    
    
        
        

