

# EditableSettings

Base class for settings, allowing values to be overridden by environment variables.  This is useful in production for secrets you do not wish to save in code, it plays nicely with docker(-compose), Heroku and any 12 factor app design.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**lightningInvoiceExpiry** | **Integer** |  |  [optional] |
|**boltzNetwork** | **String** |  |  [optional] |
|**boltzUrl** | **String** |  |  [optional] |
|**boltzMempoolSpaceUrl** | **String** |  |  [optional] |
|**boltzMempoolSpaceUrlWs** | **String** |  |  [optional] |
|**lntipsApiEndpoint** | **String** |  |  [optional] |
|**lntipsApiKey** | **String** |  |  [optional] |
|**lntipsAdminKey** | **String** |  |  [optional] |
|**lntipsInvoiceKey** | **String** |  |  [optional] |
|**sparkUrl** | **String** |  |  [optional] |
|**sparkToken** | **String** |  |  [optional] |
|**opennodeApiEndpoint** | **String** |  |  [optional] |
|**opennodeKey** | **String** |  |  [optional] |
|**opennodeAdminKey** | **String** |  |  [optional] |
|**opennodeInvoiceKey** | **String** |  |  [optional] |
|**lnpayApiEndpoint** | **String** |  |  [optional] |
|**lnpayApiKey** | **String** |  |  [optional] |
|**lnpayWalletKey** | **String** |  |  [optional] |
|**lnpayAdminKey** | **String** |  |  [optional] |
|**lndGrpcEndpoint** | **String** |  |  [optional] |
|**lndGrpcCert** | **String** |  |  [optional] |
|**lndGrpcPort** | **Integer** |  |  [optional] |
|**lndGrpcAdminMacaroon** | **String** |  |  [optional] |
|**lndGrpcInvoiceMacaroon** | **String** |  |  [optional] |
|**lndGrpcMacaroon** | **String** |  |  [optional] |
|**lndGrpcMacaroonEncrypted** | **String** |  |  [optional] |
|**lndRestEndpoint** | **String** |  |  [optional] |
|**lndRestCert** | **String** |  |  [optional] |
|**lndRestMacaroon** | **String** |  |  [optional] |
|**lndRestMacaroonEncrypted** | **String** |  |  [optional] |
|**lndCert** | **String** |  |  [optional] |
|**lndAdminMacaroon** | **String** |  |  [optional] |
|**lndInvoiceMacaroon** | **String** |  |  [optional] |
|**lndRestAdminMacaroon** | **String** |  |  [optional] |
|**lndRestInvoiceMacaroon** | **String** |  |  [optional] |
|**eclairUrl** | **String** |  |  [optional] |
|**eclairPass** | **String** |  |  [optional] |
|**corelightningRpc** | **String** |  |  [optional] |
|**clightningRpc** | **String** |  |  [optional] |
|**clicheEndpoint** | **String** |  |  [optional] |
|**lnbitsEndpoint** | **String** |  |  [optional] |
|**lnbitsKey** | **String** |  |  [optional] |
|**lnbitsAdminKey** | **String** |  |  [optional] |
|**lnbitsInvoiceKey** | **String** |  |  [optional] |
|**fakeWalletSecret** | **String** |  |  [optional] |
|**lnbitsBackendWalletClass** | **String** |  |  [optional] |
|**lnbitsRateLimitNo** | **String** |  |  [optional] |
|**lnbitsRateLimitUnit** | **String** |  |  [optional] |
|**lnbitsAllowedIps** | **List&lt;String&gt;** |  |  [optional] |
|**lnbitsBlockedIps** | **List&lt;String&gt;** |  |  [optional] |
|**lnbitsNotifications** | **Boolean** |  |  [optional] |
|**lnbitsKillswitch** | **Boolean** |  |  [optional] |
|**lnbitsKillswitchInterval** | **Integer** |  |  [optional] |
|**lnbitsWatchdog** | **Boolean** |  |  [optional] |
|**lnbitsWatchdogInterval** | **Integer** |  |  [optional] |
|**lnbitsWatchdogDelta** | **Integer** |  |  [optional] |
|**lnbitsStatusManifest** | **String** |  |  [optional] |
|**lnbitsBaseurl** | **String** |  |  [optional] |
|**lnbitsReserveFeeMin** | **Integer** |  |  [optional] |
|**lnbitsReserveFeePercent** | **BigDecimal** |  |  [optional] |
|**lnbitsServiceFee** | **BigDecimal** |  |  [optional] |
|**lnbitsHideApi** | **Boolean** |  |  [optional] |
|**lnbitsDenomination** | **String** |  |  [optional] |
|**lnbitsSiteTitle** | **String** |  |  [optional] |
|**lnbitsSiteTagline** | **String** |  |  [optional] |
|**lnbitsSiteDescription** | **String** |  |  [optional] |
|**lnbitsDefaultWalletName** | **String** |  |  [optional] |
|**lnbitsThemeOptions** | **List&lt;String&gt;** |  |  [optional] |
|**lnbitsCustomLogo** | **String** |  |  [optional] |
|**lnbitsAdSpaceTitle** | **String** |  |  [optional] |
|**lnbitsAdSpace** | **String** |  |  [optional] |
|**lnbitsAdSpaceEnabled** | **Boolean** |  |  [optional] |
|**lnbitsAllowedCurrencies** | **List&lt;String&gt;** |  |  [optional] |
|**lnbitsAdminExtensions** | **List&lt;String&gt;** |  |  [optional] |
|**lnbitsExtensionsManifests** | **List&lt;String&gt;** |  |  [optional] |
|**lnbitsAdminUsers** | **List&lt;String&gt;** |  |  [optional] |
|**lnbitsAllowedUsers** | **List&lt;String&gt;** |  |  [optional] |



