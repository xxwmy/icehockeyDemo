package com.icehockey.entity;

import java.util.Date;

public class Place {
	private int placeId;// ;// int(11) NOT NULL AUTO_INCREMENT COMMENT '冰厂编号',
	private String logo;// ;// varchar(255) DEFAULT NULL,
	private String placeName;// varchar(255) DEFAULT NULL COMMENT '场地名称',
	private String placeAddress;// varchar(255) DEFAULT NULL COMMENT '场地地址',
	private String placeNumber;// varchar(11) DEFAULT NULL COMMENT '场地电话',
	private String indoor;// varchar(255) DEFAULT '是' COMMENT '室内冰场',
	private String changingRoom;// varchar(255) DEFAULT '有' COMMENT '更衣室',
	private String parkingLot;// varchar(255) DEFAULT '有' COMMENT '有停车场',
	private String trainingDegree;// varchar(255) DEFAULT NULL COMMENT
									// '训练等级冰场：国际比赛冰场，国家比赛冰场',
	private int scale;// int(11) DEFAULT NULL COMMENT '规模冰场',
	private String landTrainingRoom;// varchar(255) DEFAULT '有' COMMENT '陆地训练室',
	private double area;// double DEFAULT NULL COMMENT '占地面积',
	private double iceArea;// double DEFAULT NULL COMMENT '冰面面积',
	private Date buildDate;// date DEFAULT '1970-01-01' COMMENT '建成时间',
	private Date useDate;// date DEFAULT '1970-01-01' COMMENT '投入使用时间',
	private Date openDate;// date DEFAULT '1970-01-01' COMMENT '对外开放时间',
	private String acceptIndividual;// varchar(255) DEFAULT '是' COMMENT '接受散滑',
	private String linkman;// varchar(255) DEFAULT NULL COMMENT '联系人',
	private String linkNumber;// varchar(11) DEFAULT NULL COMMENT '联系人电话',
	private String email;// varchar(255) DEFAULT NULL COMMENT '电子邮件',
	private String surface;// varchar(255) DEFAULT NULL COMMENT '真冰冰面,仿真冰面',
	private String organization;// varchar(255) DEFAULT NULL COMMENT '所属机构',
	private String image;// varchar(255) DEFAULT NULL COMMENT '球场图片',
	public int getPlaceId() {
		return placeId;
	}
	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public String getPlaceName() {
		return placeName;
	}
	public void setPlaceName(String placeName) {
		this.placeName = placeName;
	}
	public String getPlaceAddress() {
		return placeAddress;
	}
	public void setPlaceAddress(String placeAddress) {
		this.placeAddress = placeAddress;
	}
	public String getPlaceNumber() {
		return placeNumber;
	}
	public void setPlaceNumber(String placeNumber) {
		this.placeNumber = placeNumber;
	}
	public String getIndoor() {
		return indoor;
	}
	public void setIndoor(String indoor) {
		this.indoor = indoor;
	}
	public String getChangingRoom() {
		return changingRoom;
	}
	public void setChangingRoom(String changingRoom) {
		this.changingRoom = changingRoom;
	}
	public String getParkingLot() {
		return parkingLot;
	}
	public void setParkingLot(String parkingLot) {
		this.parkingLot = parkingLot;
	}
	public String getTrainingDegree() {
		return trainingDegree;
	}
	public void setTrainingDegree(String trainingDegree) {
		this.trainingDegree = trainingDegree;
	}
	public int getScale() {
		return scale;
	}
	public void setScale(int scale) {
		this.scale = scale;
	}
	public String getLandTrainingRoom() {
		return landTrainingRoom;
	}
	public void setLandTrainingRoom(String landTrainingRoom) {
		this.landTrainingRoom = landTrainingRoom;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public double getIceArea() {
		return iceArea;
	}
	public void setIceArea(double iceArea) {
		this.iceArea = iceArea;
	}
	public Date getBuildDate() {
		return buildDate;
	}
	public void setBuildDate(Date buildDate) {
		this.buildDate = buildDate;
	}
	public Date getUseDate() {
		return useDate;
	}
	public void setUseDate(Date useDate) {
		this.useDate = useDate;
	}
	public Date getOpenDate() {
		return openDate;
	}
	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}
	public String getAcceptIndividual() {
		return acceptIndividual;
	}
	public void setAcceptIndividual(String acceptIndividual) {
		this.acceptIndividual = acceptIndividual;
	}
	public String getLinkman() {
		return linkman;
	}
	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}
	public String getLinkNumber() {
		return linkNumber;
	}
	public void setLinkNumber(String linkNumber) {
		this.linkNumber = linkNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSurface() {
		return surface;
	}
	public void setSurface(String surface) {
		this.surface = surface;
	}
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Place [placeId=" + placeId + ", logo=" + logo + ", placeName="
				+ placeName + ", placeAddress=" + placeAddress
				+ ", placeNumber=" + placeNumber + ", indoor=" + indoor
				+ ", changingRoom=" + changingRoom + ", parkingLot="
				+ parkingLot + ", trainingDegree=" + trainingDegree
				+ ", scale=" + scale + ", landTrainingRoom=" + landTrainingRoom
				+ ", area=" + area + ", iceArea=" + iceArea + ", buildDate="
				+ buildDate + ", useDate=" + useDate + ", openDate=" + openDate
				+ ", acceptIndividual=" + acceptIndividual + ", linkman="
				+ linkman + ", linkNumber=" + linkNumber + ", email=" + email
				+ ", surface=" + surface + ", organization=" + organization
				+ ", image=" + image + "]";
	}
	public Place(int placeId, String logo, String placeName,
			String placeAddress, String placeNumber, String indoor,
			String changingRoom, String parkingLot, String trainingDegree,
			int scale, String landTrainingRoom, double area, double iceArea,
			Date buildDate, Date useDate, Date openDate,
			String acceptIndividual, String linkman, String linkNumber,
			String email, String surface, String organization, String image) {
		super();
		this.placeId = placeId;
		this.logo = logo;
		this.placeName = placeName;
		this.placeAddress = placeAddress;
		this.placeNumber = placeNumber;
		this.indoor = indoor;
		this.changingRoom = changingRoom;
		this.parkingLot = parkingLot;
		this.trainingDegree = trainingDegree;
		this.scale = scale;
		this.landTrainingRoom = landTrainingRoom;
		this.area = area;
		this.iceArea = iceArea;
		this.buildDate = buildDate;
		this.useDate = useDate;
		this.openDate = openDate;
		this.acceptIndividual = acceptIndividual;
		this.linkman = linkman;
		this.linkNumber = linkNumber;
		this.email = email;
		this.surface = surface;
		this.organization = organization;
		this.image = image;
	}
	public Place() {
		super();
	}
	
	
}
