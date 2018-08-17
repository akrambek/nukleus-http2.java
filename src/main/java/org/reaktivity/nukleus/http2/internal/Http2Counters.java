/**
 * Copyright 2016-2017 The Reaktivity Project
 *
 * The Reaktivity Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package org.reaktivity.nukleus.http2.internal;

import java.util.function.Function;
import java.util.function.LongSupplier;

public class Http2Counters
{
    public final LongSupplier headersFramesRead;
    public final LongSupplier dataFramesRead;
    public final LongSupplier priorityFramesRead;
    public final LongSupplier resetStreamFramesRead;
    public final LongSupplier goawayFramesRead;
    public final LongSupplier windowUpdateFramesRead;
    public final LongSupplier settingsFramesRead;
    public final LongSupplier pingFramesRead;
    public final LongSupplier pushPromiseFramesRead;
    public final LongSupplier unknownFramesRead;

    public final LongSupplier headersFramesWritten;
    public final LongSupplier dataFramesWritten;
    public final LongSupplier priorityFramesWritten;
    public final LongSupplier resetStreamFramesWritten;
    public final LongSupplier goawayFramesWritten;
    public final LongSupplier windowUpdateFramesWritten;
    public final LongSupplier settingsFramesWritten;
    public final LongSupplier pingFramesWritten;
    public final LongSupplier pushPromiseFramesWritten;
    public final LongSupplier pushPromiseFramesSkipped;
    public final LongSupplier pushHeadersFramesWritten;

    public Http2Counters(
        Function<String, LongSupplier> supplyCounter)
    {
        this.headersFramesRead = supplyCounter.apply("frames.read.headers");
        this.dataFramesRead = supplyCounter.apply("frames.read.data");
        this.priorityFramesRead = supplyCounter.apply("frames.read.priority");
        this.resetStreamFramesRead = supplyCounter.apply("frames.read.reset.stream");
        this.goawayFramesRead = supplyCounter.apply("frames.read.goaway");
        this.windowUpdateFramesRead = supplyCounter.apply("frames.read.window.update");
        this.settingsFramesRead = supplyCounter.apply("frames.read.settings");
        this.pingFramesRead = supplyCounter.apply("frames.read.ping");
        this.pushPromiseFramesRead = supplyCounter.apply("frames.read.push.promise");
        this.unknownFramesRead = supplyCounter.apply("frames.read.unknown");

        this.headersFramesWritten = supplyCounter.apply("frames.written.headers");
        this.dataFramesWritten = supplyCounter.apply("frames.written.data");
        this.priorityFramesWritten = supplyCounter.apply("frames.written.priority");
        this.resetStreamFramesWritten = supplyCounter.apply("frames.written.reset.stream");
        this.goawayFramesWritten = supplyCounter.apply("frames.written.goaway");
        this.windowUpdateFramesWritten = supplyCounter.apply("frames.written.window.update");
        this.settingsFramesWritten = supplyCounter.apply("frames.written.settings");
        this.pingFramesWritten = supplyCounter.apply("frames.written.ping");
        this.pushPromiseFramesWritten = supplyCounter.apply("frames.written.push.promise");
        this.pushPromiseFramesSkipped = supplyCounter.apply("frames.skipped.push.promise");
        this.pushHeadersFramesWritten = supplyCounter.apply("frames.written.push.headers");
    }
}
