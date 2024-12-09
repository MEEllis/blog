package com.vue.exerInterface;

//interface的应用： 静态Proxy模式
public class NetworkTest {
    public static void main(String[] args) {
        ProxyServer proxyServer = new ProxyServer(new Server());
        proxyServer.connecting();
    }
}

interface Network {
    public abstract void connecting();
}

class Server implements Network {

    @Override
    public void connecting() {
        System.out.println("Server connecting.....");
    }
}


class ProxyServer implements Network {
    Network net;

    public ProxyServer(Network net) {
        this.net = net;
    }

    private void check() {
        System.out.println("ProxyServer check.....");
    }

    @Override
    public void connecting() {
        this.check();
        net.connecting();
    }
}