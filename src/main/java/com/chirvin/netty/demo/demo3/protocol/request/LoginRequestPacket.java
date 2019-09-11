package com.chirvin.netty.demo.demo3.protocol.request;

import com.chirvin.netty.demo.demo3.protocol.Packet;
import lombok.Data;
import static com.chirvin.netty.demo.demo3.protocol.command.Command.LOGIN_REQUEST;

@Data
public class LoginRequestPacket extends Packet {

    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
