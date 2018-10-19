package ornek15.anotation.siniflar;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Insan {	
	public String UyariAdi();
	public String UyariTuru();

}
