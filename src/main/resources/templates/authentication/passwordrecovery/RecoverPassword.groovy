package templates.authentication.passwordrecovery

layout 'authentication/AuthenticationMain.groovy',
        pageTitle: 'Batch Manager | Recover Password',
        withBodyClasses: 'hold-transition login-page',
        boxType: 'login-box',
        mainBody: contents {
            include unescaped: 'authentication/passwordrecovery/RecoverPasswordBody.vfm'
        }
