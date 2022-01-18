package com.tutorial.models;


import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "MOL_MAIN_VO")
public class MolMain {

	@Id
	@Column(name="ID")
	private Long id;
	
	@Column(name="ARTICLE_ID")
	private Long articleId;
	
	@Column(name="SITE_ID")	
	private Long siteId;
	
	@Column(name="MASTER_PRODUCT_CODE")
	private String masterProductCode;
	
	@Column(name="order_id")
	private Long orderId;
	
//	@Column(name="description_1")
//	private String description1;
	
	@Column(name="planned_quantity")
	private Long plannedQuantity;
	
	@Column(name="initial_planned_quantity")
	private Long initialPlannedQuantity;
	
	@Column(name="planned_value")
	private Long plannedValue;
	
	@Column(name="initial_planned_value")
	private Long initialPlannedValue;
	
//	@Column(name="planned_availability_date")
//	private Timestamp plannedAvailDate;
	
//	@Column(name="minimum_order_quantity")
//	private Long minOrderQuantity;
	
	@Column(name="stock_quantity")
	private Long stockQuantity;
	
	@Column(name="safety_stock")
	private Long safetyStock;
	
//	@Column(name="max_maximum_stock")
//	private Long maxMaxStock;
	
	@Column(name="category_family")
	private String categoryFamily;
	
	@Column(name="initial_supplier_id")
	private Long initialSupplierId;
	
	@Column(name="supplier_code")
	private String supplierCode;
	
	@Column(name="supplier_name1")
	private String supplierName1;
	
	@Column(name="supplier_variant")
	private String supplierVariant;
	
	@Column(name="supplier_variant_code_desc")
	private String supplierVariantCodeDesc;
	
//	@Column(name="product_group")
//	private String productGrp;
	
//	@Column(name="product_group_facing")
//	private String productGrpFacing;
	
	@Column(name="abc_category")
	private String abcCategory;
	
	@Column(name="sales_price")
	private Long salesPrice;
	
//	@Column(name="category_full_name")
//	private String categFullName;
	
//	@Column(name="calculation_price")
//	private Long calcPrice;
	
	@Column(name="is_validated")
	private int isValidated;
	
	@Column(name="is_manual_order")
	private int isManualOrder;
	
	@Column(name="is_order_today")
	private int isorderToday;
	
	@Column(name="is_next_order")
	private int isNextDoor;
	
	@Column(name="is_active")
	private int isActive;
	
	@Column(name="is_blocked")
	private int isBlocked;
	
	@Column(name="rounding_qty")
	private Long roundingQty;
	
	@Column(name="planned_availability_date_iw")
	private String plannedAvaDateIw;
	
	@Column(name="planned_availability_date_mm")
	private String plannedAvaDateMM;
	
	@Column(name="planned_availability_date_yyyy")
	private String plannedAvaDateYYYY;
	
	@Column(name="supplier_id")
	private Long supplierId;
	
//	@Column(name="category_level_name")
//	private String catLevelName;
	
	@Column(name="master_product_code_desc")
	private String masterProductCodeDesc;
	
	@Column(name="article_hierarchy")
	private String articleHierarchy;
	
	@Column(name="site_code")
	private String siteCode;
	
	@Column(name="avg_qty")
	private Long avgQty;
	
	@Column(name="real_qty")
	private Long realQty;
	
	@Column(name="fcst_qty")
	private Long fcstQty;
	
	@Column(name="replenishment_user")
	private String replenishmentUser;
	
	@Column(name="order_status")
	private String orderStatus;
	
	@Column(name="supplier_variant_name")
	private String supplierVariantName;
	
//	@Column(name="outbound_sold_quantity")
//	private Long outboundSoldQty;
	
	@Column(name="outbound_unsold_quantity_list")
	private String outboundUnsoldQtyList;
	
	@Column(name="outbound_sold_value")
	private Long outboundSoldValue;
	
	@Column(name="outbound_unsold_value_list")
	private String outboundUnsoldValList;
	
	@Column(name="site_code_name")
	private String siteCodeName;
	
	@Column(name="xyz_class")
	private String xyzClass;
	
	@Column(name="alert_name")
	private String alertName;
	
	@Column(name="alert_icon")
	private String alertIcon;
	
	@Column(name="alert_count")
	private Long alertCount;
	
	@Column(name="sparkline")
	private String sparkline;
	
	@Column(name="block_start_date")
	private Timestamp blockStartDate;
	
	@Column(name="block_end_date")
	private Timestamp blockEndDate;
	
	@Column(name="alert_susp_id")
	private Long alertSuspId;
	
	@Column(name="alert_susp_icon")
	private String alertSuspIcon;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getArticleId() {
		return articleId;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public Long getSiteId() {
		return siteId;
	}

	public void setSiteId(Long siteId) {
		this.siteId = siteId;
	}

	public String getMasterProductCode() {
		return masterProductCode;
	}

	public void setMasterProductCode(String masterProductCode) {
		this.masterProductCode = masterProductCode;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getPlannedQuantity() {
		return plannedQuantity;
	}

	public void setPlannedQuantity(Long plannedQuantity) {
		this.plannedQuantity = plannedQuantity;
	}

	public Long getInitialPlannedQuantity() {
		return initialPlannedQuantity;
	}

	public void setInitialPlannedQuantity(Long initialPlannedQuantity) {
		this.initialPlannedQuantity = initialPlannedQuantity;
	}

	public Long getPlannedValue() {
		return plannedValue;
	}

	public void setPlannedValue(Long plannedValue) {
		this.plannedValue = plannedValue;
	}

	public Long getInitialPlannedValue() {
		return initialPlannedValue;
	}

	public void setInitialPlannedValue(Long initialPlannedValue) {
		this.initialPlannedValue = initialPlannedValue;
	}

	public Long getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Long stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public Long getSafetyStock() {
		return safetyStock;
	}

	public void setSafetyStock(Long safetyStock) {
		this.safetyStock = safetyStock;
	}

	public String getCategoryFamily() {
		return categoryFamily;
	}

	public void setCategoryFamily(String categoryFamily) {
		this.categoryFamily = categoryFamily;
	}

	public Long getInitialSupplierId() {
		return initialSupplierId;
	}

	public void setInitialSupplierId(Long initialSupplierId) {
		this.initialSupplierId = initialSupplierId;
	}

	public String getSupplierCode() {
		return supplierCode;
	}

	public void setSupplierCode(String supplierCode) {
		this.supplierCode = supplierCode;
	}

	public String getSupplierName1() {
		return supplierName1;
	}

	public void setSupplierName1(String supplierName1) {
		this.supplierName1 = supplierName1;
	}

	public String getSupplierVariant() {
		return supplierVariant;
	}

	public void setSupplierVariant(String supplierVariant) {
		this.supplierVariant = supplierVariant;
	}

	public String getSupplierVariantCodeDesc() {
		return supplierVariantCodeDesc;
	}

	public void setSupplierVariantCodeDesc(String supplierVariantCodeDesc) {
		this.supplierVariantCodeDesc = supplierVariantCodeDesc;
	}

	public String getAbcCategory() {
		return abcCategory;
	}

	public void setAbcCategory(String abcCategory) {
		this.abcCategory = abcCategory;
	}

	public Long getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Long salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getIsValidated() {
		return isValidated;
	}

	public void setIsValidated(int isValidated) {
		this.isValidated = isValidated;
	}

	public int getIsManualOrder() {
		return isManualOrder;
	}

	public void setIsManualOrder(int isManualOrder) {
		this.isManualOrder = isManualOrder;
	}

	public int getIsorderToday() {
		return isorderToday;
	}

	public void setIsorderToday(int isorderToday) {
		this.isorderToday = isorderToday;
	}

	public int getIsNextDoor() {
		return isNextDoor;
	}

	public void setIsNextDoor(int isNextDoor) {
		this.isNextDoor = isNextDoor;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public int getIsBlocked() {
		return isBlocked;
	}

	public void setIsBlocked(int isBlocked) {
		this.isBlocked = isBlocked;
	}

	public Long getRoundingQty() {
		return roundingQty;
	}

	public void setRoundingQty(Long roundingQty) {
		this.roundingQty = roundingQty;
	}

	public String getPlannedAvaDateIw() {
		return plannedAvaDateIw;
	}

	public void setPlannedAvaDateIw(String plannedAvaDateIw) {
		this.plannedAvaDateIw = plannedAvaDateIw;
	}

	public String getPlannedAvaDateMM() {
		return plannedAvaDateMM;
	}

	public void setPlannedAvaDateMM(String plannedAvaDateMM) {
		this.plannedAvaDateMM = plannedAvaDateMM;
	}

	public String getPlannedAvaDateYYYY() {
		return plannedAvaDateYYYY;
	}

	public void setPlannedAvaDateYYYY(String plannedAvaDateYYYY) {
		this.plannedAvaDateYYYY = plannedAvaDateYYYY;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public String getMasterProductCodeDesc() {
		return masterProductCodeDesc;
	}

	public void setMasterProductCodeDesc(String masterProductCodeDesc) {
		this.masterProductCodeDesc = masterProductCodeDesc;
	}

	public String getArticleHierarchy() {
		return articleHierarchy;
	}

	public void setArticleHierarchy(String articleHierarchy) {
		this.articleHierarchy = articleHierarchy;
	}

	public String getSiteCode() {
		return siteCode;
	}

	public void setSiteCode(String siteCode) {
		this.siteCode = siteCode;
	}

	public Long getAvgQty() {
		return avgQty;
	}

	public void setAvgQty(Long avgQty) {
		this.avgQty = avgQty;
	}

	public Long getRealQty() {
		return realQty;
	}

	public void setRealQty(Long realQty) {
		this.realQty = realQty;
	}

	public Long getFcstQty() {
		return fcstQty;
	}

	public void setFcstQty(Long fcstQty) {
		this.fcstQty = fcstQty;
	}

	public String getReplenishmentUser() {
		return replenishmentUser;
	}

	public void setReplenishmentUser(String replenishmentUser) {
		this.replenishmentUser = replenishmentUser;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getSupplierVariantName() {
		return supplierVariantName;
	}

	public void setSupplierVariantName(String supplierVariantName) {
		this.supplierVariantName = supplierVariantName;
	}

	public String getOutboundUnsoldQtyList() {
		return outboundUnsoldQtyList;
	}

	public void setOutboundUnsoldQtyList(String outboundUnsoldQtyList) {
		this.outboundUnsoldQtyList = outboundUnsoldQtyList;
	}

	public Long getOutboundSoldValue() {
		return outboundSoldValue;
	}

	public void setOutboundSoldValue(Long outboundSoldValue) {
		this.outboundSoldValue = outboundSoldValue;
	}

	public String getOutboundUnsoldValList() {
		return outboundUnsoldValList;
	}

	public void setOutboundUnsoldValList(String outboundUnsoldValList) {
		this.outboundUnsoldValList = outboundUnsoldValList;
	}

	public String getSiteCodeName() {
		return siteCodeName;
	}

	public void setSiteCodeName(String siteCodeName) {
		this.siteCodeName = siteCodeName;
	}

	public String getXyzClass() {
		return xyzClass;
	}

	public void setXyzClass(String xyzClass) {
		this.xyzClass = xyzClass;
	}

	public String getAlertName() {
		return alertName;
	}

	public void setAlertName(String alertName) {
		this.alertName = alertName;
	}

	public String getAlertIcon() {
		return alertIcon;
	}

	public void setAlertIcon(String alertIcon) {
		this.alertIcon = alertIcon;
	}

	public Long getAlertCount() {
		return alertCount;
	}

	public void setAlertCount(Long alertCount) {
		this.alertCount = alertCount;
	}

	public String getSparkline() {
		return sparkline;
	}

	public void setSparkline(String sparkline) {
		this.sparkline = sparkline;
	}

	public Timestamp getBlockStartDate() {
		return blockStartDate;
	}

	public void setBlockStartDate(Timestamp blockStartDate) {
		this.blockStartDate = blockStartDate;
	}

	public Timestamp getBlockEndDate() {
		return blockEndDate;
	}

	public void setBlockEndDate(Timestamp blockEndDate) {
		this.blockEndDate = blockEndDate;
	}

	public Long getAlertSuspId() {
		return alertSuspId;
	}

	public void setAlertSuspId(Long alertSuspId) {
		this.alertSuspId = alertSuspId;
	}

	public String getAlertSuspIcon() {
		return alertSuspIcon;
	}

	public void setAlertSuspIcon(String alertSuspIcon) {
		this.alertSuspIcon = alertSuspIcon;
	}
	
	
}
