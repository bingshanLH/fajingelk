package com.fajing.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseParentFile<M extends BaseParentFile<M>> extends Model<M> implements IBean {

	public M setId(java.lang.Integer id) {
		set("id", id);
		return (M)this;
	}
	
	public java.lang.Integer getId() {
		return getInt("id");
	}

	public M setCreationTime(java.util.Date creationTime) {
		set("creation_time", creationTime);
		return (M)this;
	}
	
	public java.util.Date getCreationTime() {
		return get("creation_time");
	}

	public M setPublish(java.lang.String publish) {
		set("publish", publish);
		return (M)this;
	}
	
	public java.lang.String getPublish() {
		return getStr("publish");
	}

	public M setName(java.lang.String name) {
		set("name", name);
		return (M)this;
	}
	
	public java.lang.String getName() {
		return getStr("name");
	}

	public M setPublishTime(java.lang.Long publishTime) {
		set("publish_time", publishTime);
		return (M)this;
	}
	
	public java.lang.Long getPublishTime() {
		return getLong("publish_time");
	}

	public M setMaterialDate(java.lang.Long materialDate) {
		set("material_date", materialDate);
		return (M)this;
	}
	
	public java.lang.Long getMaterialDate() {
		return getLong("material_date");
	}

	public M setRemark(java.lang.String remark) {
		set("remark", remark);
		return (M)this;
	}
	
	public java.lang.String getRemark() {
		return getStr("remark");
	}

	public M setContentKey(java.lang.String contentKey) {
		set("content_key", contentKey);
		return (M)this;
	}
	
	public java.lang.String getContentKey() {
		return getStr("content_key");
	}

	public M setSortParent(java.lang.Long sortParent) {
		set("sort_parent", sortParent);
		return (M)this;
	}
	
	public java.lang.Long getSortParent() {
		return getLong("sort_parent");
	}

	public M setImgUrl(java.lang.String imgUrl) {
		set("img_url", imgUrl);
		return (M)this;
	}
	
	public java.lang.String getImgUrl() {
		return getStr("img_url");
	}

}
