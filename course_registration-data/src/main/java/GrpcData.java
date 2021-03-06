import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import services.ReservationService;

public class GrpcData {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Starting course-registration-data...");
		Server server = ServerBuilder.forPort(9090).addService(new ReservationService()).build();
		server.start();
		System.out.println("Server started at " + server.getPort());

		server.awaitTermination();
	}
}


