package io.kroki.server.service;

import io.kroki.server.decode.SourceDecoder;
import io.kroki.server.format.FileFormat;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.json.JsonObject;

import java.util.Arrays;
import java.util.List;

public class RailRoad implements DiagramService{

    private static final List<FileFormat> SUPPORTED_FORMATS = Arrays.asList(FileFormat.PNG, FileFormat.SVG);

    public RailRoad(Vertx vertx, JsonObject config) {
    }

    @Override
    public List<FileFormat> getSupportedFormats() {
        return SUPPORTED_FORMATS;
    }

    @Override
    public SourceDecoder getSourceDecoder() {
        return null;
    }

    @Override
    public String getVersion() {
        return null;
    }

    @Override
    public void convert(String sourceDecoded, String serviceName, FileFormat fileFormat, JsonObject options, Handler<AsyncResult<Buffer>> handler) {

    }
}
