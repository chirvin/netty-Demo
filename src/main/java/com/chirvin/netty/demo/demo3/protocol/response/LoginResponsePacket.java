package com.chirvin.netty.demo.demo3.protocol.response;

import com.chirvin.netty.demo.demo3.protocol.Packet;
import lombok.Data;
import static com.chirvin.netty.demo.demo3.protocol.command.Command.LOGIN_RESPONSE;

@Data
public class LoginResponsePacket extends Packet {
    private boolean success;

    private String reason;


    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
