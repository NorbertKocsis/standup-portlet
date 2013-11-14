/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.support.standup.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link StandUpEntry}.
 * </p>
 *
 * @author Daniel Javorszky
 * @see StandUpEntry
 * @generated
 */
public class StandUpEntryWrapper implements StandUpEntry,
	ModelWrapper<StandUpEntry> {
	public StandUpEntryWrapper(StandUpEntry standUpEntry) {
		_standUpEntry = standUpEntry;
	}

	@Override
	public Class<?> getModelClass() {
		return StandUpEntry.class;
	}

	@Override
	public String getModelClassName() {
		return StandUpEntry.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("entryId", getEntryId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("quantity", getQuantity());
		attributes.put("difficulty", getDifficulty());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("blocking", getBlocking());
		attributes.put("additionalDetails", getAdditionalDetails());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long entryId = (Long)attributes.get("entryId");

		if (entryId != null) {
			setEntryId(entryId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Integer quantity = (Integer)attributes.get("quantity");

		if (quantity != null) {
			setQuantity(quantity);
		}

		Integer difficulty = (Integer)attributes.get("difficulty");

		if (difficulty != null) {
			setDifficulty(difficulty);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String blocking = (String)attributes.get("blocking");

		if (blocking != null) {
			setBlocking(blocking);
		}

		String additionalDetails = (String)attributes.get("additionalDetails");

		if (additionalDetails != null) {
			setAdditionalDetails(additionalDetails);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	* Returns the primary key of this stand up entry.
	*
	* @return the primary key of this stand up entry
	*/
	@Override
	public long getPrimaryKey() {
		return _standUpEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this stand up entry.
	*
	* @param primaryKey the primary key of this stand up entry
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_standUpEntry.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the entry ID of this stand up entry.
	*
	* @return the entry ID of this stand up entry
	*/
	@Override
	public long getEntryId() {
		return _standUpEntry.getEntryId();
	}

	/**
	* Sets the entry ID of this stand up entry.
	*
	* @param entryId the entry ID of this stand up entry
	*/
	@Override
	public void setEntryId(long entryId) {
		_standUpEntry.setEntryId(entryId);
	}

	/**
	* Returns the company ID of this stand up entry.
	*
	* @return the company ID of this stand up entry
	*/
	@Override
	public long getCompanyId() {
		return _standUpEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this stand up entry.
	*
	* @param companyId the company ID of this stand up entry
	*/
	@Override
	public void setCompanyId(long companyId) {
		_standUpEntry.setCompanyId(companyId);
	}

	/**
	* Returns the group ID of this stand up entry.
	*
	* @return the group ID of this stand up entry
	*/
	@Override
	public long getGroupId() {
		return _standUpEntry.getGroupId();
	}

	/**
	* Sets the group ID of this stand up entry.
	*
	* @param groupId the group ID of this stand up entry
	*/
	@Override
	public void setGroupId(long groupId) {
		_standUpEntry.setGroupId(groupId);
	}

	/**
	* Returns the user ID of this stand up entry.
	*
	* @return the user ID of this stand up entry
	*/
	@Override
	public long getUserId() {
		return _standUpEntry.getUserId();
	}

	/**
	* Sets the user ID of this stand up entry.
	*
	* @param userId the user ID of this stand up entry
	*/
	@Override
	public void setUserId(long userId) {
		_standUpEntry.setUserId(userId);
	}

	/**
	* Returns the user uuid of this stand up entry.
	*
	* @return the user uuid of this stand up entry
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this stand up entry.
	*
	* @param userUuid the user uuid of this stand up entry
	*/
	@Override
	public void setUserUuid(java.lang.String userUuid) {
		_standUpEntry.setUserUuid(userUuid);
	}

	/**
	* Returns the quantity of this stand up entry.
	*
	* @return the quantity of this stand up entry
	*/
	@Override
	public int getQuantity() {
		return _standUpEntry.getQuantity();
	}

	/**
	* Sets the quantity of this stand up entry.
	*
	* @param quantity the quantity of this stand up entry
	*/
	@Override
	public void setQuantity(int quantity) {
		_standUpEntry.setQuantity(quantity);
	}

	/**
	* Returns the difficulty of this stand up entry.
	*
	* @return the difficulty of this stand up entry
	*/
	@Override
	public int getDifficulty() {
		return _standUpEntry.getDifficulty();
	}

	/**
	* Sets the difficulty of this stand up entry.
	*
	* @param difficulty the difficulty of this stand up entry
	*/
	@Override
	public void setDifficulty(int difficulty) {
		_standUpEntry.setDifficulty(difficulty);
	}

	/**
	* Returns the create date of this stand up entry.
	*
	* @return the create date of this stand up entry
	*/
	@Override
	public java.util.Date getCreateDate() {
		return _standUpEntry.getCreateDate();
	}

	/**
	* Sets the create date of this stand up entry.
	*
	* @param createDate the create date of this stand up entry
	*/
	@Override
	public void setCreateDate(java.util.Date createDate) {
		_standUpEntry.setCreateDate(createDate);
	}

	/**
	* Returns the modified date of this stand up entry.
	*
	* @return the modified date of this stand up entry
	*/
	@Override
	public java.util.Date getModifiedDate() {
		return _standUpEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this stand up entry.
	*
	* @param modifiedDate the modified date of this stand up entry
	*/
	@Override
	public void setModifiedDate(java.util.Date modifiedDate) {
		_standUpEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Returns the blocking of this stand up entry.
	*
	* @return the blocking of this stand up entry
	*/
	@Override
	public java.lang.String getBlocking() {
		return _standUpEntry.getBlocking();
	}

	/**
	* Sets the blocking of this stand up entry.
	*
	* @param blocking the blocking of this stand up entry
	*/
	@Override
	public void setBlocking(java.lang.String blocking) {
		_standUpEntry.setBlocking(blocking);
	}

	/**
	* Returns the additional details of this stand up entry.
	*
	* @return the additional details of this stand up entry
	*/
	@Override
	public java.lang.String getAdditionalDetails() {
		return _standUpEntry.getAdditionalDetails();
	}

	/**
	* Sets the additional details of this stand up entry.
	*
	* @param additionalDetails the additional details of this stand up entry
	*/
	@Override
	public void setAdditionalDetails(java.lang.String additionalDetails) {
		_standUpEntry.setAdditionalDetails(additionalDetails);
	}

	/**
	* Returns the status of this stand up entry.
	*
	* @return the status of this stand up entry
	*/
	@Override
	public int getStatus() {
		return _standUpEntry.getStatus();
	}

	/**
	* Sets the status of this stand up entry.
	*
	* @param status the status of this stand up entry
	*/
	@Override
	public void setStatus(int status) {
		_standUpEntry.setStatus(status);
	}

	@Override
	public boolean isNew() {
		return _standUpEntry.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_standUpEntry.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _standUpEntry.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_standUpEntry.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _standUpEntry.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _standUpEntry.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_standUpEntry.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _standUpEntry.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_standUpEntry.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_standUpEntry.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_standUpEntry.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new StandUpEntryWrapper((StandUpEntry)_standUpEntry.clone());
	}

	@Override
	public int compareTo(StandUpEntry standUpEntry) {
		return _standUpEntry.compareTo(standUpEntry);
	}

	@Override
	public int hashCode() {
		return _standUpEntry.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<StandUpEntry> toCacheModel() {
		return _standUpEntry.toCacheModel();
	}

	@Override
	public StandUpEntry toEscapedModel() {
		return new StandUpEntryWrapper(_standUpEntry.toEscapedModel());
	}

	@Override
	public StandUpEntry toUnescapedModel() {
		return new StandUpEntryWrapper(_standUpEntry.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _standUpEntry.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _standUpEntry.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_standUpEntry.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof StandUpEntryWrapper)) {
			return false;
		}

		StandUpEntryWrapper standUpEntryWrapper = (StandUpEntryWrapper)obj;

		if (Validator.equals(_standUpEntry, standUpEntryWrapper._standUpEntry)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public StandUpEntry getWrappedStandUpEntry() {
		return _standUpEntry;
	}

	@Override
	public StandUpEntry getWrappedModel() {
		return _standUpEntry;
	}

	@Override
	public void resetOriginalValues() {
		_standUpEntry.resetOriginalValues();
	}

	private StandUpEntry _standUpEntry;
}