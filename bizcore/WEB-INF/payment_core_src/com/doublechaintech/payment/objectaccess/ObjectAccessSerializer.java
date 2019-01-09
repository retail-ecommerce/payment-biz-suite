package com.doublechaintech.payment.objectaccess;
import java.io.IOException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.doublechaintech.payment.PaymentObjectPlainCustomSerializer;
public class ObjectAccessSerializer extends PaymentObjectPlainCustomSerializer<ObjectAccess>{

	@Override
	public void serialize(ObjectAccess objectAccess, JsonGenerator jgen,
			SerializerProvider provider) throws IOException,
			JsonProcessingException {
			
		this.writeBaseEntityField(jgen, null, objectAccess, provider);
		
	}
}


