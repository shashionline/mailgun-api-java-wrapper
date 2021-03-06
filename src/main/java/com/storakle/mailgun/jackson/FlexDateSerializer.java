package com.storakle.mailgun.jackson;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @see <a href="http://www.baeldung.com/jackson-serialize-dates">Jackon Custom date serialization</a>
 * @see <a href="http://www.leveluplunch.com/java/tutorials/033-custom-jackson-date-deserializer/">Jackon Custom date serialization</a>
 */
public final class FlexDateSerializer extends JsonSerializer<Date>
{

    @Override
    public void serialize(final Date value, final JsonGenerator gen, final SerializerProvider arg2) throws IOException
    {
        gen.writeString(getFormatter().format(value));
    }

    //
    //
    private static SimpleDateFormat getFormatter()
    {
        return FormatHolder.INSTANCE;
    }

    /**
     */
    private interface FormatHolder
    {
        SimpleDateFormat INSTANCE = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
    }
}