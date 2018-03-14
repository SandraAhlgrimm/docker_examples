import io.vertx.core.AbstractVerticle;

public class HelloVerticle extends AbstractVerticle {

    @Override
    public void start() {
        vertx.createHttpServer().requestHandler(req -> {
            req.response()
                    .putHeader("content-type", "application/json")
                    .end("{ message: 'Hello World! 🐳' }");
        }).listen(8087);
    }
}