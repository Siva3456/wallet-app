package com.wallet.app.dao;

import com.wallet.app.dto.Wallet;
import com.wallet.app.exception.WalletException;
import com.wallet.app.exception.WalletRepositoryException;

public interface WalletDao {
	// CRUD
public	Wallet addWallet(Wallet newWallet) throws WalletException;

public	Wallet getWalletById(Integer walletId) throws WalletException;

public	Wallet updateWallet(Wallet updateWallet) throws WalletException;

public	Wallet deleteWalletById(Integer walletID) throws WalletRepositoryException, WalletException;
}

