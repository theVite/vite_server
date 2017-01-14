package service;

/**
 * Class that holds the implementation of the Service interface
 */
@Component
public class ViteService implements Service.Iface {
    private static final Logger LOGGER = LoggerFactory.getLogger(ViteService.class);
    
    @Override
    public void ping() {
	LOGGER.debug("Server Pinged");
    }
}
