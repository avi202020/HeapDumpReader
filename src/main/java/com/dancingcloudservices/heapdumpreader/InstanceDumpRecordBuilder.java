package com.dancingcloudservices.heapdumpreader;

import com.dancingcloudservices.heapdumpreader.utils.HeapDumpTag;

import java.io.InputStream;
import java.util.Map;

public class InstanceDumpRecordBuilder implements HeapDumpRecordBuilder {
    @Override
    public HeapDumpRecord build(HeapDumpTag tag, InputStream is, Map<Long, StringRecord> strings, Map<Long, ClassRecord> classes, Map<Long, Long> objects) {
        throw new RuntimeException("Instance Dump not yet handled");
    }
}
