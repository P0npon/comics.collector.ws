package cfranc.com.comics.collector.ws.dto;

public class AlbumShortDTO {
	String scenaristName;
	String cartoonistName;
	String title;
	String serie;
	
	public AlbumShortDTO(String scenaristName , String cartoonistName) {
		this(scenaristName,cartoonistName,"","");
	}
	
	public AlbumShortDTO(String scenaristName , String cartoonistName, String title,String serie) {
		super();
		this.scenaristName = scenaristName;
		this.scenaristName = cartoonistName;
		this.scenaristName = title;
		this.scenaristName = serie;
	}

}
