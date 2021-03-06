/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class AddMediaRequest extends RpcAcsRequest<AddMediaResponse> {
	
	public AddMediaRequest() {
		super("Mts", "2014-06-18", "AddMedia", "mts");
	}

	private Long resourceOwnerId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String description;

	private Long ownerId;

	private String title;

	private String tags;

	private String coverURL;

	private Long cateId;

	private String fileURL;

	private String mediaWorkflowId;

	private String mediaWorkflowUserData;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getCoverURL() {
		return this.coverURL;
	}

	public void setCoverURL(String coverURL) {
		this.coverURL = coverURL;
		if(coverURL != null){
			putQueryParameter("CoverURL", coverURL);
		}
	}

	public Long getCateId() {
		return this.cateId;
	}

	public void setCateId(Long cateId) {
		this.cateId = cateId;
		if(cateId != null){
			putQueryParameter("CateId", cateId.toString());
		}
	}

	public String getFileURL() {
		return this.fileURL;
	}

	public void setFileURL(String fileURL) {
		this.fileURL = fileURL;
		if(fileURL != null){
			putQueryParameter("FileURL", fileURL);
		}
	}

	public String getMediaWorkflowId() {
		return this.mediaWorkflowId;
	}

	public void setMediaWorkflowId(String mediaWorkflowId) {
		this.mediaWorkflowId = mediaWorkflowId;
		if(mediaWorkflowId != null){
			putQueryParameter("MediaWorkflowId", mediaWorkflowId);
		}
	}

	public String getMediaWorkflowUserData() {
		return this.mediaWorkflowUserData;
	}

	public void setMediaWorkflowUserData(String mediaWorkflowUserData) {
		this.mediaWorkflowUserData = mediaWorkflowUserData;
		if(mediaWorkflowUserData != null){
			putQueryParameter("MediaWorkflowUserData", mediaWorkflowUserData);
		}
	}

	@Override
	public Class<AddMediaResponse> getResponseClass() {
		return AddMediaResponse.class;
	}

}
