package com.doublechaintech.payment.genericform;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.doublechaintech.payment.PaymentObjectPlainCustomSerializer;
public class GenericFormSerializer extends PaymentObjectPlainCustomSerializer<GenericForm>{

	@Override
	public void serialize(GenericForm genericForm, JsonGenerator jgen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
			
		this.writeBaseEntityField(jgen, null, genericForm, provider);
		
	}
}


