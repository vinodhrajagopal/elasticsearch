package elasticsearch;


public interface IndexEventHandler {
	public void handle(ElasticSearchIndexEvent event);
}
