package com.locanette.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="loc_product")
public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8407928838299220657L;
	@Id @GeneratedValue @Column(length=20)
	private long id;
	@Column(length=20)
	private String code;
	@Column(length=200)
	private String designation;
	private double rentalPrice;
	private double damagePrice;
	@Column(length=1000)
	private String description;
	@Column(length=20)
	private long minimumThreshold;
	@Column(length=20)
	private long amountStored;
	private double discount;
	@Column(length=1)
	private boolean visible;
	
	@ManyToOne
	private ProductCategory category;
	@ManyToOne
	private Supplier supplier;
	@ManyToOne
	private Warehouse warehouse;
	
	@OneToMany(mappedBy="product",fetch=FetchType.LAZY)
	private Collection<OrderProduct> orderProducts;
	@OneToMany(mappedBy="product",fetch=FetchType.LAZY)
	private Collection<ProductPicture> productPictures;
	@OneToMany(mappedBy="product",fetch=FetchType.LAZY)
	private Collection<ProductHistorical> productHistoricals;
	
	@OneToOne(mappedBy="product",fetch=FetchType.LAZY)
	private Vehicle vihecle;
	@OneToOne(mappedBy="product",fetch=FetchType.LAZY)
	private Provider provider;
	@OneToOne(mappedBy="product",fetch=FetchType.LAZY)
	private EventEquipment equipment;
	@OneToOne(mappedBy="product",fetch=FetchType.LAZY)
	private Space space;
	@OneToOne(mappedBy="product",fetch=FetchType.LAZY)
	private Room room;
	@OneToOne(mappedBy="product",fetch=FetchType.LAZY)
	private House house;
	@OneToOne(mappedBy="product",fetch=FetchType.LAZY)
	private ProfessionalTool tool;
	/**
	 * 
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param code
	 * @param designation
	 * @param rentalPrice
	 * @param damagePrice
	 * @param description
	 * @param minimumThreshold
	 * @param amountStored
	 * @param discount
	 * @param visible
	 * @param category
	 * @param supplier
	 * @param warehouse
	 * @param productPictures
	 */
	public Product(String code, String designation, double rentalPrice, double damagePrice, String description,
			long minimumThreshold, long amountStored, double discount, boolean visible, ProductCategory category,
			Supplier supplier, Warehouse warehouse, Collection<ProductPicture> productPictures) {
		super();
		this.code = code;
		this.designation = designation;
		this.rentalPrice = rentalPrice;
		this.damagePrice = damagePrice;
		this.description = description;
		this.minimumThreshold = minimumThreshold;
		this.amountStored = amountStored;
		this.discount = discount;
		this.visible = visible;
		this.category = category;
		this.supplier = supplier;
		this.warehouse = warehouse;
		this.productPictures = productPictures;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getRentalPrice() {
		return rentalPrice;
	}
	public void setRentalPrice(double rentalPrice) {
		this.rentalPrice = rentalPrice;
	}
	public double getDamagePrice() {
		return damagePrice;
	}
	public void setDamagePrice(double damagePrice) {
		this.damagePrice = damagePrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getMinimumThreshold() {
		return minimumThreshold;
	}
	public void setMinimumThreshold(long minimumThreshold) {
		this.minimumThreshold = minimumThreshold;
	}
	public long getAmountStored() {
		return amountStored;
	}
	public void setAmountStored(long amountStored) {
		this.amountStored = amountStored;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public ProductCategory getCategory() {
		return category;
	}
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	public Supplier getSupplier() {
		return supplier;
	}
	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	public Collection<OrderProduct> getOrderProducts() {
		return orderProducts;
	}
	public void setOrderProducts(Collection<OrderProduct> orderProducts) {
		this.orderProducts = orderProducts;
	}
	public Collection<ProductPicture> getProductPictures() {
		return productPictures;
	}
	public void setProductPictures(Collection<ProductPicture> productPictures) {
		this.productPictures = productPictures;
	}
	public Collection<ProductHistorical> getProductHistoricals() {
		return productHistoricals;
	}
	public void setProductHistoricals(Collection<ProductHistorical> productHistoricals) {
		this.productHistoricals = productHistoricals;
	}
	public Vehicle getVihecle() {
		return vihecle;
	}
	public void setVihecle(Vehicle vihecle) {
		this.vihecle = vihecle;
	}
	public Provider getProvider() {
		return provider;
	}
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	public EventEquipment getEquipment() {
		return equipment;
	}
	public void setEquipment(EventEquipment equipment) {
		this.equipment = equipment;
	}
	public Space getSpace() {
		return space;
	}
	public void setSpace(Space space) {
		this.space = space;
	}
	public Room getRoom() {
		return room;
	}
	public void setRoom(Room room) {
		this.room = room;
	}
	public House getHouse() {
		return house;
	}
	public void setHouse(House house) {
		this.house = house;
	}
	public ProfessionalTool getTool() {
		return tool;
	}
	public void setTool(ProfessionalTool tool) {
		this.tool = tool;
	}
	
	
}
