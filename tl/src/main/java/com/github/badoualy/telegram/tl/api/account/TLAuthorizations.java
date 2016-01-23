package com.github.badoualy.telegram.tl.api.account;

import com.github.badoualy.telegram.tl.TLContext;
import com.github.badoualy.telegram.tl.api.TLAuthorization;
import com.github.badoualy.telegram.tl.core.TLObject;
import com.github.badoualy.telegram.tl.core.TLVector;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import static com.github.badoualy.telegram.tl.StreamUtils.readTLVector;
import static com.github.badoualy.telegram.tl.StreamUtils.writeTLVector;

/**
 * @author Yannick Badoual yann.badoual@gmail.com
 * @see <a href="http://github.com/badoualy/kotlogram">http://github.com/badoualy/kotlogram</a>
 */
public class TLAuthorizations extends TLObject {
    public static final int CLASS_ID = 0x1250abde;

    protected TLVector<TLAuthorization> authorizations;

    public TLAuthorizations() {
    }

    public TLAuthorizations(TLVector<TLAuthorization> authorizations) {
        this.authorizations = authorizations;
    }

    @Override
    public void serializeBody(OutputStream stream) throws IOException {
        writeTLVector(authorizations, stream);
    }

    @Override
    @SuppressWarnings("unchecked")
    public void deserializeBody(InputStream stream, TLContext context) throws IOException {
        authorizations = readTLVector(stream, context);
    }

    @Override
    public String toString() {
        return "account.authorizations#1250abde";
    }

    @Override
    public int getClassId() {
        return CLASS_ID;
    }

    public TLVector<TLAuthorization> getAuthorizations() {
        return authorizations;
    }

    public void setAuthorizations(TLVector<TLAuthorization> authorizations) {
        this.authorizations = authorizations;
    }
}
