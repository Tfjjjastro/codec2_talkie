package com.radio.codec2talkie.protocol.aprs;

import com.radio.codec2talkie.protocol.message.TextMessage;
import com.radio.codec2talkie.protocol.position.Position;

public interface AprsData {
    boolean isPositionReport();
    boolean isTextMessage();
    void fromPosition(Position position);
    void fromTextMessage(TextMessage textMessage);
    Position toPosition();
    TextMessage toTextMessage();
    void fromBinary(String srcCallsign, String dstCallsign, String digipath, byte[] infoData);
    byte[] toBinary();
    boolean isValid();
}
