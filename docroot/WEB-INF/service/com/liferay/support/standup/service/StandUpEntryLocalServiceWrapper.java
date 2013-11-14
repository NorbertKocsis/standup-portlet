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

package com.liferay.support.standup.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link StandUpEntryLocalService}.
 *
 * @author Daniel Javorszky
 * @see StandUpEntryLocalService
 * @generated
 */
public class StandUpEntryLocalServiceWrapper implements StandUpEntryLocalService,
	ServiceWrapper<StandUpEntryLocalService> {
	public StandUpEntryLocalServiceWrapper(
		StandUpEntryLocalService standUpEntryLocalService) {
		_standUpEntryLocalService = standUpEntryLocalService;
	}

	/**
	* Adds the stand up entry to the database. Also notifies the appropriate model listeners.
	*
	* @param standUpEntry the stand up entry
	* @return the stand up entry that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.standup.model.StandUpEntry addStandUpEntry(
		com.liferay.support.standup.model.StandUpEntry standUpEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.addStandUpEntry(standUpEntry);
	}

	/**
	* Creates a new stand up entry with the primary key. Does not add the stand up entry to the database.
	*
	* @param entryId the primary key for the new stand up entry
	* @return the new stand up entry
	*/
	@Override
	public com.liferay.support.standup.model.StandUpEntry createStandUpEntry(
		long entryId) {
		return _standUpEntryLocalService.createStandUpEntry(entryId);
	}

	/**
	* Deletes the stand up entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param entryId the primary key of the stand up entry
	* @return the stand up entry that was removed
	* @throws PortalException if a stand up entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.standup.model.StandUpEntry deleteStandUpEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.deleteStandUpEntry(entryId);
	}

	/**
	* Deletes the stand up entry from the database. Also notifies the appropriate model listeners.
	*
	* @param standUpEntry the stand up entry
	* @return the stand up entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.standup.model.StandUpEntry deleteStandUpEntry(
		com.liferay.support.standup.model.StandUpEntry standUpEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.deleteStandUpEntry(standUpEntry);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _standUpEntryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.standup.model.impl.StandUpEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.standup.model.impl.StandUpEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public com.liferay.support.standup.model.StandUpEntry fetchStandUpEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.fetchStandUpEntry(entryId);
	}

	/**
	* Returns the stand up entry with the primary key.
	*
	* @param entryId the primary key of the stand up entry
	* @return the stand up entry
	* @throws PortalException if a stand up entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.standup.model.StandUpEntry getStandUpEntry(
		long entryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.getStandUpEntry(entryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the stand up entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.liferay.support.standup.model.impl.StandUpEntryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of stand up entries
	* @param end the upper bound of the range of stand up entries (not inclusive)
	* @return the range of stand up entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<com.liferay.support.standup.model.StandUpEntry> getStandUpEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.getStandUpEntries(start, end);
	}

	/**
	* Returns the number of stand up entries.
	*
	* @return the number of stand up entries
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getStandUpEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.getStandUpEntriesCount();
	}

	/**
	* Updates the stand up entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param standUpEntry the stand up entry
	* @return the stand up entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.liferay.support.standup.model.StandUpEntry updateStandUpEntry(
		com.liferay.support.standup.model.StandUpEntry standUpEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _standUpEntryLocalService.updateStandUpEntry(standUpEntry);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _standUpEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_standUpEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _standUpEntryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public StandUpEntryLocalService getWrappedStandUpEntryLocalService() {
		return _standUpEntryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedStandUpEntryLocalService(
		StandUpEntryLocalService standUpEntryLocalService) {
		_standUpEntryLocalService = standUpEntryLocalService;
	}

	@Override
	public StandUpEntryLocalService getWrappedService() {
		return _standUpEntryLocalService;
	}

	@Override
	public void setWrappedService(
		StandUpEntryLocalService standUpEntryLocalService) {
		_standUpEntryLocalService = standUpEntryLocalService;
	}

	private StandUpEntryLocalService _standUpEntryLocalService;
}