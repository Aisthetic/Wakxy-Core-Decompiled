package com.ankamagames.wakfu.client.binaryStorage;

import com.ankamagames.framework.fileFormat.io.binaryStorage2.*;
import com.ankamagames.wakfu.common.binaryStorage.*;

public class GemAndPowderBinaryData implements BinaryData
{
    protected int m_id;
    
    public int getId() {
        return this.m_id;
    }
    
    @Override
    public void reset() {
        this.m_id = 0;
    }
    
    @Override
    public void read(final RandomByteBufferReader buffer) throws Exception {
        this.m_id = buffer.getInt();
    }
    
    @Override
    public final int getDataTypeId() {
        return WakfuBinaryStorableType.GEM_AND_POWDER.getId();
    }
}
