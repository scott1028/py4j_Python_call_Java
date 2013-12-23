import py4j.GatewayServer;

// compilee command: javac -cp C:\Python27\Lib\site-packages\py4j-0.8-py2.7.egg\share\py4j\py4j0.8.jar AdditionApplication.java
// 執行前先使用 echo %CLASSPATH% 確定 py4j.jay 的路徑在環境變數內。
// 之後要先啟動這個 Gateway Server, 在執行 Python 程式

public class AdditionApplication {

  public int addition(int first, int second) {
    return first + second;
  }

  public static void main(String[] args) {
    AdditionApplication app = new AdditionApplication();
    // app is now the gateway.entry_point
    GatewayServer server = new GatewayServer(app);
    server.start();
  }
}